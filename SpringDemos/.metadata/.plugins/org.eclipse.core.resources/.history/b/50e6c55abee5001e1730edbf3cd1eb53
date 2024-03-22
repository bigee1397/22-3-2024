package com.bookapp.client;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;
import com.bookapp.util.BookDetails;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBookService bookService = new BookServiceImpl();
        try {
                System.out.println("1.Get all books\n"
                        + "2.Find book by substring of starting name of author\n"
                        + "3.Find books by category\n"
                        + "4.Find books prices less than\n"
                        + "5.Find by both author and category\n"
                        + "6.Find by book id\n"
                        + "7.Exit");
                System.out.println("Enter your choice");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("List of all books: ");
                        for (Book book : bookService.getAll()) {
                            System.out.println(book);
                        }
                        break;
                    case 2:
                        System.out.println("Enter the starting substring of author name");
                        String authName = sc.next();
                        for (Book book : bookService.getByAuthorStartsWith(authName)) {
                            System.out.println(book);
                        }
                        break;
                    case 3:

                        System.out.println("Enter the category");
                        String category = sc.next();
                        for (Book book : bookService.getByCategory(category)) {
                            System.out.println(book);
                        }
                        break;
                    case 4:
                        System.out.println("Enter the price ");
                        double price = sc.nextDouble();
                        for (Book book : bookService.getPriceLessThan(price)) {
                            System.out.println(book);
                        }
                        break;
                    case 5:
                        System.out.println("Enter the author name");
                        String authorName = sc.nextLine();
                        System.out.println("Enter the category");
                        String categoryName = sc.next();
                        for (Book book : bookService.getByAuthorContainsAndCategory("jkrowling", "fiction")) {
                            System.out.println(book);
                        }
                        break;
                    case 6:
                        System.out.println("Enter the book id");
                        int bookId = sc.nextInt();
                            System.out.println(bookService.getById(bookId));
                        break;
                    case 7:
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
