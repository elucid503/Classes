package Class12Practice;

import java.util.ArrayList;
import java.util.Iterator;

class Book {

    private final String title;

    public Book(String title) {

        this.title = title;

    }

    public String getTitle() {

        return title;

    }

}

class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {

        books.add(book);

    }

    public void printFirstBookTitle() {

        System.out.println(books.getFirst().getTitle());

    }

    public void removeBookUsingIterator(String bookTitle) {

        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {

            Book book = iterator.next();

            if (book.getTitle().equals(bookTitle)) {

                iterator.remove();

            }

        }

    }
}

class Main { // Not public to avoid conflicts with other classes... 3 classes in one file is not ideal

    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("Hypermedia Systems"));
        library.addBook(new Book("Effective Java"));

        library.printFirstBookTitle();

        library.removeBookUsingIterator(("Effective Java"));

        library.printFirstBookTitle();

    }
}
