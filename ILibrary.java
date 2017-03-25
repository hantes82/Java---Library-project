package pkg3;

/**
 * Created by kondz on 19.03.2017.
 */
import java.util.Collection;

/**
 * Created by itml on 19.03.2017.
 */
public interface ILibrary {



    public void showLibrary ();
    /**
     * Finds book in library.
     * @param title of book to be found
     * @return book if found or null if book doesn't exist
     */
    Book findBook(String title);

    /**
     * Borrow book from library (decrease quantity by 1)
     * @param title

     * @return borrowed book or throws exception
     * @throws BookNotFoundException - if book not founded
     * @throws NoBooksAvailableException - if all books are borrowed
     */
    Book borrow(String title) throws BookNotFoundException, NoBooksAvailableException;

    /**
     * Returns book to library (increases quantity by 1)
     * @param book
     */
    void returnBook(Book book);

    /**
     * Admin function - increase quantity of book in library
     * @param title - title of book
     * @param newQuantity - new quantity
     */
    void increaseQuantity(String title, int newQuantity);

    /**
     * Remove book from library.
     * Warning: Book cannot be withdrawn if borrowed.
     *
     * @param title
     */
    void withdrawBook(String title);

    /**
     * Changes title of book in collection.
     * @param oldTitle - old title of book
     * @param newTitle - new title of book
     * @throws BookNotFoundException - if there is no book of given oldTitle
     */
    void changeBookTitle(String oldTitle, String newTitle) throws BookNotFoundException;

    /**
     * Shows all available books in library (quantity doesn't matter)
     * @return list or other collection of all books
     */
    Collection<Book> getAvailableBooks();

}
