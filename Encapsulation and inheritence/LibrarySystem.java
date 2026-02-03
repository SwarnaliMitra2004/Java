/*Start with a base class LibraryItem that includes common 
attributes like itemID, title, and author, and methods like 
checkout() and returnItem(). Create subclasses such as Book, 
Magazine, and DVD, each inheriting from LibraryItem. Add unique 
attributes to each subclass, like ISBN for Book, issueNumber for 
Magazine, and duration for DVD. */

import java.util.Scanner;

// Base class
class LibraryItem {

    protected String itemID;
    protected String title;
    protected String author;
    protected boolean isCheckedOut;

    public LibraryItem(String itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public void checkout() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }

    @Override
    public String toString() {
        return "ID: " + itemID + ", Title: " + title + ", Author: " + author +
               ", Checked Out: " + isCheckedOut;
    }
}

// Subclass: Book
class Book extends LibraryItem {

    private String ISBN;

    public Book(String itemID, String title, String author, String ISBN) {
        super(itemID, title, author);
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + ", ISBN: " + ISBN;
    }
}

// Subclass: Magazine
class Magazine extends LibraryItem {

    private int issueNumber;

    public Magazine(String itemID, String title, String author, int issueNumber) {
        super(itemID, title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", Issue Number: " + issueNumber;
    }
}

// Subclass: DVD
class DVD extends LibraryItem {

    private int duration; // in minutes

    public DVD(String itemID, String title, String author, int duration) {
        super(itemID, title, author);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duration: " + duration + " mins";
    }
}

// Main class
public class LibrarySystem {

    public static void main(String[] args) {

        // Create sample items
        Book book = new Book("B001", "Java Programming", "Alice", "123-456-789");
        Magazine magazine = new Magazine("M001", "Tech Today", "Bob", 42);
        DVD dvd = new DVD("D001", "Inception", "Christopher Nolan", 148);

        // Display details
        System.out.println(book);
        System.out.println(magazine);
        System.out.println(dvd);

        // Checkout items
        book.checkout();
        magazine.checkout();

        // Try checking out again
        book.checkout();

        // Return items
        book.returnItem();
        dvd.returnItem(); // not checked out

        // Optional: interactive checkout via Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Interactive Checkout ---");
        System.out.print("Do you want to checkout the DVD? (yes/no): ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            dvd.checkout();
        }
        sc.close();
    }
}
