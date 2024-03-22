package com.bookapp.repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.bookapp.model.Book;

public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setBookAuthor(rs.getString("bookAuthor"));
		book.setBookCategory(rs.getString("bookCategory"));
		book.setBookPrice(rs.getDouble("bookPrice"));
		book.setBookTitle(rs.getString("bookTitle"));
		return book;
	}


	
}
