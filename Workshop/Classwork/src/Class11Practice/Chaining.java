package Class11Practice;

import java.util.ArrayList;

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

        System.out.println(books.get(0).getTitle());

    }
}

class Main { // Not public to avoid conflicts with other classes... 3 classes in one file is not ideal

    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("Java Programming"));
        library.addBook(new Book("Effective Java"));

        library.printFirstBookTitle();

    }
}
