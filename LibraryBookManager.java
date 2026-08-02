/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarybookmanager;

import java.util.Scanner;

public class LibraryBookManager {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Library library = new Library();
1
        int choice;

        do {

            System.out.println("\n===== Library Book Manager =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Title: ");
                    String title = input.nextLine();

                    System.out.print("Enter Author: ");
                    String author = input.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = input.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = input.nextInt();
                    input.nextLine();

                    Book book = new Book(id, title, author, isbn, quantity);
                    library.addBook(book);

                    break;

                case 2:

                    library.displayBooks();
                    break;

                case 3:

                    System.out.print("Enter ISBN to Search: ");
                    isbn = input.nextLine();

                    Book foundBook = library.searchBook(isbn);

                    if (foundBook != null) {
                        System.out.println("\nBook Found:");
                        System.out.println(foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter ISBN to Issue: ");
                    isbn = input.nextLine();
                    library.issueBook(isbn);

                    break;

                case 5:

                    System.out.print("Enter ISBN to Return: ");
                    isbn = input.nextLine();
                    library.returnBook(isbn);

                    break;

                case 6:

                    System.out.println("Thank you! Program Closed.");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        input.close();
    }
}