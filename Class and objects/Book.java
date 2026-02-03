/*reate a Book class for a library system.
• Instance variables: title, author, isbn.
• Static variable: totalBooks, a counter for the total number of book 
instances.
• Instance methods: borrowBook(), returnBook().
• Static method: getTotalBooks(), to get the total number of books in the 
library. */

public class Book {

    // Instance variables
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    // Static variable to count total books
    private static int totalBooks = 0;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
        totalBooks++;  // Increment totalBooks when a new book is created
    }

    // Instance method to borrow the book
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    // Instance method to return the book
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    // Static method to get total number of books
    public static int getTotalBooks() {
        return totalBooks;
    }

    // Optional: Display book info
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn
                + ", Borrowed: " + isBorrowed);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "12345");
        Book book2 = new Book("1984", "George Orwell", "67890");

        book1.displayBookInfo();
        book2.displayBookInfo();

        book1.borrowBook();
        book1.borrowBook(); // Try borrowing again
        book1.returnBook();
        book1.returnBook(); // Try returning again

        System.out.println("Total books in library: " + Book.getTotalBooks());
    }
}
