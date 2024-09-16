// Modifications done by Paul U and Ian L

class Book {

    // Props

    private String author;
    private String title;
    private int bookID;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */

    public Book(String bookAuthor, String bookTitle) {

        author = bookAuthor;
        title = bookTitle;

    }

    // Getters/Setters

    public String getAuthor() {

        return author;

    }

    public String getTitle() {

        return title;

    }

    public int getBookID() {

        return bookID;

    }

    public void setBookID(int id) {

        bookID = id;

    }

    // Methods

    public boolean isBook(int id) {

        // could be a string but a bit more complicated

        return bookID == id;

    }

    // Main method

    public static void main(String[] args) {

        Book book = new Book("Carson Gross", "Hypermedia Systems");

        book.setBookID(503);

        System.out.println(book.isBook(503));
        System.out.println(book.isBook(42));

    }

}
