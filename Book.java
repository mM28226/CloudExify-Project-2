/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarybookmanager;

public class Book {

    private int id;
    private String title;
    private String author;
    private String isbn;
    private int quantity;

    public Book(int id, String title, String author, String isbn, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void issueBook() {
        if (quantity > 0) {
            quantity--;
        }
    }

    public void returnBook() {
        quantity++;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               "\nTitle: " + title +
               "\nAuthor: " + author +
               "\nISBN: " + isbn +
               "\nQuantity: " + quantity;
    }
}