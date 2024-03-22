package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.BookRepositoryImpl;
import com.bookapp.repository.IBookRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	IBookRepository bookRepository;
	
	@Override
	public void addBook(Book book) {
		bookRepository.addBook(book);
	}

	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		bookRepository.updateBook(bookId, price);
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		bookRepository.deleteBook(bookId);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@Override
	public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> booksByAuthor = bookRepository.findByAuthorStartsWith(author);
		if(booksByAuthor.isEmpty()) throw new BookNotFoundException("Book with author not found");
		return booksByAuthor;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> booksByCat = bookRepository.findByCategory(category);
		if(booksByCat.isEmpty()) throw new BookNotFoundException("Book with this category not found");
		return booksByCat;
	}

	@Override
	public List<Book> getPriceLessThan(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> booksLessThan = bookRepository.findPriceLessThan(price);
		if(booksLessThan.isEmpty()) throw new BookNotFoundException("Books less than price not found");
		return booksLessThan;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> booksByAuthCat = bookRepository.findByAuthorContainsAndCategory(author, category);
		if(booksByAuthCat.isEmpty()) throw new BookNotFoundException("Book not found with the category and name");
		return booksByAuthCat;
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		if(bookRepository.findById(bookId) == null) throw new IdNotFoundException("Searched book id not found");
		return bookRepository.findById(bookId);
	}
}
