/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package librarybookmanager;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println("----------------------------");
            System.out.println(book);
        }
    }

    public Book searchBook(String isbn) {

        for (Book book : books) {

            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }

        return null;
    }

    public void issueBook(String isbn) {

        Book book = searchBook(isbn);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.getQuantity() > 0) {
            book.issueBook();
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("No copies available.");
        }
    }

    public void returnBook(String isbn) {

        Book book = searchBook(isbn);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        book.returnBook();
        System.out.println("Book returned successfully.");
    }
}