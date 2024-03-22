package com.bookapp;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappJdbcApplication.class, args);
	}

	@Autowired
	IBookService bookService;
	
	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
        try {
                System.out.println("1.Add Book\n"
                		+ "2.Update Book price\n"
                		+ "3.Delete book\n"
                		+ "4.Get all books\n"
                        + "5.Find book by substring of starting name of author\n"
                        + "6.Find books by category\n"
                        + "7.Find books prices less than\n"
                        + "8.Find by both author and category\n"
                        + "9.Find by book id\n"
                        + "10.Exit");
                System.out.println("Enter your choice");
                int choice = sc.nextInt();
                switch (choice) {
	                case 1:
	                    System.out.println("Adding a book");
	                    System.out.println("Enter a book title: ");
	                    String title = sc.next();
	                    System.out.println("Enter the book category: ");
						String cat = sc.next();
						System.out.println("Enter the book author: ");
						String author = sc.next();
						System.out.println("Enter the book price: ");
						double price = sc.nextDouble();
						bookService.addBook(new Book(title, author, cat, price));
	                    break;
	                case 2:
                        System.out.println("Updating a book price");
                        System.out.println("Enter the book id: ");
                        int bookId=sc.nextInt();
                        System.out.println("Enter the book price: ");
                        double conFee = sc.nextDouble();
                        bookService.updateBook(bookId, conFee);
                        break;
	                case 3:
                        System.out.println("Deleting a book");
                        System.out.println("Enter the book id: ");
                        int bookId1=sc.nextInt();
                        bookService.deleteBook(bookId1);
                        break;
                    case 4:
                        System.out.println("List of all books: ");
                        for (Book book : bookService.getAll()) {
                            System.out.println(book);
                        }
                        break;
                    case 5:
                        System.out.println("Enter the starting substring of author name");
                        String authName = sc.next();
                        for (Book book : bookService.getByAuthorStartsWith(authName)) {
                            System.out.println(book);
                        }
                        break;
                    case 6:

                        System.out.println("Enter the category");
                        String category = sc.next();
                        for (Book book : bookService.getByCategory(category)) {
                            System.out.println(book);
                        }
                        break;
                    case 7:
                        System.out.println("Enter the price ");
                        double price1 = sc.nextDouble();
                        for (Book book : bookService.getPriceLessThan(price1)) {
                            System.out.println(book);
                        }
                        break;
                    case 8:
                        System.out.println("Enter the author name");
                        String authorName = sc.nextLine();
                        System.out.println("Enter the category");
                        String categoryName = sc.next();
                        for (Book book : bookService.getByAuthorContainsAndCategory(authorName, categoryName)) {
                            System.out.println(book);
                        }
                        break;
                    case 9:
                        System.out.println("Enter the book id");
                        int bookId2 = sc.nextInt();
                            System.out.println(bookService.getById(bookId2));
                        break;
                    case 10:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid input...........");
                        break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
