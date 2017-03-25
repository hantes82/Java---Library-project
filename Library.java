package pkg3;

import java.util.*;

/**
 * Created by itml on 19.03.2017.
 */
public class Library implements ILibrary {

    protected Map <Book, Integer> bookCollection;

    public Library() {
        this.initLibrary();
    }

    private void initLibrary() {
        if (bookCollection == null) {
            bookCollection = new HashMap<Book, Integer>();
        }
        bookCollection.put(new Book("Novel Part 2", "John Doe", "12345XYZ", 400),1);
        bookCollection.put(new Book("Scary book", "John Doe", "12345XYZ", 39),2);
        bookCollection.put(new Book("The Moon", "Jack Strong", "555345XYZ", 99),3);
        bookCollection.put(new Book("Crazy Race", "Mick Jager", "44445XYZ", 40),10);
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookCollection=" + bookCollection +
                '}';
    }

    public void showLibrary () {
        for (Map.Entry<Book, Integer> element : bookCollection.entrySet()) {
            Book key = element.getKey();
            Integer value = element.getValue();
            System.out.println("Książka: "+key+"; Ilość egzemplarzy: "+value+"\n");
        }
    }


    @Override
    public Book findBook(String title) {
        Iterator<Map.Entry<Book, Integer>> iterator = bookCollection.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, Integer> entry = iterator.next();
            Book key = entry.getKey();
            if (key.getTitle().equals(title)) {
                return key;
            }
        }
        return null;
    }

    @Override
    public Book borrow(String title) throws BookNotFoundException, NoBooksAvailableException {



        Book b = findBook(title);

        if (b != null) {
            Integer quantity = bookCollection.get(b);

            if (quantity == 0) {
                throw new NoBooksAvailableException("No more books");
            } else {

                bookCollection.put(b, --quantity);
            }

        }
        else {
        throw new BookNotFoundException("");
        }
        return b;
    }


//        Iterator<Map.Entry<Book, Integer>> iterator = bookCollection.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Book, Integer> entry = iterator.next();
//            Book key = entry.getKey();
//            Integer value = entry.getValue();
//            if (key.getTitle().equals(title) && (value != 0)) {
//                entry.setValue(--value);
//              key.setBookState(key.getBookState()-1);
//                return key;
//            }
//            else if (key.getTitle().equals(title) && value == 0) {
//               throw new NoBooksAvailableException ("Niestety wszystkie książki są wypożyczone");
//            }
//        }
//
//        return null;
//    }


    @Override
    public void returnBook(Book book) {
        Iterator<Map.Entry<Book, Integer>> iterator = bookCollection.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, Integer> entry = iterator.next();
            Book key = entry.getKey();
            Integer value = entry.getValue();
            if (key.getTitle().equals(book.getTitle())) {
                entry.setValue(++value);
                key.setBookState(key.getBookState()+1);
            }
        }

    }

    @Override
    public void increaseQuantity(String title, int newQuantity) {
        Iterator<Map.Entry<Book, Integer>> iterator = bookCollection.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, Integer> entry = iterator.next();
            Book key = entry.getKey();
            Integer value = entry.getValue();
            if (key.getTitle().equals(title)) {
                entry.setValue(value = newQuantity);
            }
        }
    }
    @Override
    public void withdrawBook(String title) {
        Iterator<Map.Entry<Book, Integer>> iterator = bookCollection.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, Integer> entry = iterator.next();
            Book key = entry.getKey();
            Integer value = entry.getValue();
            if (key.getTitle().equals(title) && (key.getBookState() == 0)) {
                bookCollection.remove(key);

        }
            else if (key.getTitle().equals(title) && (key.getBookState() < 0)){
                System.out.println("Masz wypożyczone sztuki tej pozycji");
            }
        }
    }

    @Override
    public void changeBookTitle(String oldTitle, String newTitle) throws BookNotFoundException {
        Iterator <Map.Entry<Book, Integer>> iterator = bookCollection.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Book, Integer> entry = iterator.next();
            Book key = entry.getKey();
            Integer value = entry.getValue();
            if (key.getTitle().equals(oldTitle)) {
                key.setTitle(newTitle);
                System.out.println("Zmieniono tytuł z: "+oldTitle+" na: "+newTitle);
            }
        }
    }

    @Override
    public Collection<Book> getAvailableBooks() {
        Iterator <Map.Entry<Book, Integer>> iterator = bookCollection.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Book, Integer> entry = iterator.next();
            Book key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.getTitle());

        }

        return null;
    }
}

