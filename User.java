package pkg3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kondz on 25.03.2017.
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList();
    }

    private List<Book> borrowedBooks;



    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook (ILibrary library, String title) {
        Book book = library.borrow(title);
        borrowedBooks.add(book);
    }

    public void returnBook (Book b) {
        borrowedBooks.remove(b);
    }

}
