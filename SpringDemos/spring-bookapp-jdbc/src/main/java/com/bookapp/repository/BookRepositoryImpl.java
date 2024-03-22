package com.bookapp.repository;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDB;
import com.bookapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements IBookRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addBook(Book book) {
		Object[] objArray = {book.getBookTitle(),book.getBookAuthor(), book.getBookCategory(), book.getBookPrice()};
		jdbcTemplate.update(Queries.INSERTQUERY, objArray);
	}

	@Override
	public void updateBook(int bookId, double price) {
		jdbcTemplate.update(Queries.UPDATEQUERY, price, bookId);
	}

	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(Queries.DELETEQUERY, bookId);
	}

	@Override
	public List<Book> findAll() {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books = jdbcTemplate.query(Queries.SELECTQUERY, mapper);
		return books;
	}

	@Override
	public List<Book> findByAuthorStartsWith(String author) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> booksByAuthor = jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY, mapper, author);
		return booksByAuthor;
	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> booksByCategory= jdbcTemplate.query(Queries.SELECTBYCATEGORYQUERY, mapper, category);
		// TODO Auto-generated method stub
		return booksByCategory;
	}

	@Override
	public List<Book> findPriceLessThan(double price) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> booksByPrice = jdbcTemplate.query(Queries.SELECTBYPRICEQUERY, mapper, price);
		return booksByPrice;
	}

	@Override
	public List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> booksByAuthorCat = jdbcTemplate.query(Queries.SELECTBYAUTHORCATQUERY, mapper, author, category);
		// TODO Auto-generated method stub
		return booksByAuthorCat;
	}

	@Override
	public Book findById(int bookId) throws IdNotFoundException {
		Book book = jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY, new BookMapper(), bookId);
		return book;
	}
	
//    @Override
//    public void addBook(Book book) {
//        try (Connection connection = BookDB.openConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTQUERY)) {
//            preparedStatement.setString(1, book.getBookTitle());
//            preparedStatement.setString(2, book.getBookAuthor());
//            preparedStatement.setString(3, book.getBookCategory());
//            preparedStatement.setDouble(4, book.getBookPrice());
//            preparedStatement.execute();
//            System.out.println("1 Row inserted......");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void updateBook(int bookId, double price) {
//        try (Connection connection = BookDB.openConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY)) {
//            preparedStatement.setDouble(1, price);
//            preparedStatement.setInt(2, bookId);
//            preparedStatement.execute();
//            System.out.println("1 Row updated......");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void deleteBook(int bookId) {
//        try (Connection connection = BookDB.openConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETEQUERY)) {
//            preparedStatement.setInt(1, bookId);
//            preparedStatement.execute();
//            System.out.println("1 Row deleted......");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public List<Book> findAll() {
//        List<Book> books = new ArrayList<>();
//        try (Connection connection = BookDB.openConnection();
//             Statement statement = connection.createStatement()) {
//            ResultSet result = statement.executeQuery(Queries.SELECTQUERY);
//
//            while (result.next()) {
//                int bookId = result.getInt("bookId");
//                String bookTitle = result.getString("bookTitle");
//                String bookAuthor = result.getString("bookAuthor");
//                String bookCategory = result.getString("bookCategory");
//                double bookPrice = result.getDouble("bookPrice");
//
//                books.add(new Book(bookId, bookTitle, bookAuthor, bookCategory, bookPrice));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return books;
//    }
//
//    @Override
//    public List<Book> findByAuthorStartsWith(String author) throws BookNotFoundException {
//        List<Book> booksByAuthor = new ArrayList<>();
//        try (Connection connection = BookDB.openConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(Queries.SELECTBYAUTHORQUERY)) {
//            preparedStatement.setString(1, author);
//            try {
//                ResultSet result = preparedStatement.executeQuery();
//                while (result.next()) {
//                    int bookId = result.getInt("bookId");
//                    String bookTitle = result.getString("bookTitle");
//                    String bookAuthor = result.getString("bookAuthor");
//                    String bookCategory = result.getString("bookCategory");
//                    double bookPrice = result.getDouble("bookPrice");
//
//                    booksByAuthor.add(new Book(bookId, bookTitle, bookAuthor, bookCategory, bookPrice));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return booksByAuthor;
//    }
//
//    @Override
//    public List<Book> findByCategory(String category) throws BookNotFoundException {
//        List<Book> booksByCategory = new ArrayList<>();
//        try (Connection connection = BookDB.openConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(Queries.SELECTBYCATEGORYQUERY)) {
//            preparedStatement.setString(1, category);
//            try (ResultSet result = preparedStatement.executeQuery()) {
//                while (result.next()) {
//                    int bookId = result.getInt("bookId");
//                    String bookTitle = result.getString("bookTitle");
//                    String bookAuthor = result.getString("bookAuthor");
//                    String bookCategory = result.getString("bookCategory");
//                    double bookPrice = result.getDouble("bookPrice");
//
//                    booksByCategory.add( new Book(bookId, bookTitle, bookAuthor, bookCategory, bookPrice));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return booksByCategory;
//    }
//
//    @Override
//    public List<Book> findPriceLessThan(double price) throws BookNotFoundException {
//        List<Book> booksByPriceLessThan = new ArrayList<>();
//        try (Connection connection = BookDB.openConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(Queries.SELECTBYPRICEQUERY)) {
//             preparedStatement.setDouble(1, price);
//            try (ResultSet result = preparedStatement.executeQuery()) {
//                while (result.next()) {
//                    int bookId = result.getInt("bookId");
//                    String bookTitle = result.getString("bookTitle");
//                    String bookAuthor = result.getString("bookAuthor");
//                    String bookCategory = result.getString("bookCategory");
//                    double bookPrice = result.getDouble("bookPrice");
//
//                    booksByPriceLessThan.add( new Book(bookId, bookTitle, bookAuthor, bookCategory, bookPrice));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return booksByPriceLessThan;
//    }
//
//    @Override
//    public List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
//        List<Book> booksByCategoryAndAuthor = new ArrayList<>();
//        try (Connection connection = BookDB.openConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(Queries.SELECTBYAUTHORCATQUERY)) {
//            preparedStatement.setString(1, author);
//            preparedStatement.setString(2, category);
//            try (ResultSet result = preparedStatement.executeQuery()) {
//                while (result.next()) {
//                    int bookId = result.getInt("bookId");
//                    String bookTitle = result.getString("bookTitle");
//                    String bookAuthor = result.getString("bookAuthor");
//                    String bookCategory = result.getString("bookCategory");
//                    double bookPrice = result.getDouble("bookPrice");
//
//                    booksByCategoryAndAuthor.add( new Book(bookId, bookTitle, bookAuthor, bookCategory, bookPrice));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return booksByCategoryAndAuthor;
//    }
//
//    @Override
//    public Book findById(int bookId) throws IdNotFoundException {
//        Book book = null;
//        try (Connection connection = BookDB.openConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(Queries.SELECTBYIDQUERY)) {
//            preparedStatement.setInt(1, bookId);
//            try (ResultSet result = preparedStatement.executeQuery()) {
//                while (result.next()) {
//                    String bookTitle = result.getString("bookTitle");
//                    String bookAuthor = result.getString("bookAuthor");
//                    String bookCategory = result.getString("bookCategory");
//                    double bookPrice = result.getDouble("bookPrice");
//
//                    book = new Book(bookId, bookTitle, bookAuthor, bookCategory, bookPrice);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return book;
//    }
}
