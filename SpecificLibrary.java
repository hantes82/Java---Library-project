package pkg3;

/**
 * Created by kondz on 25.03.2017.
 */
public class SpecificLibrary extends Library {


    public Book borrow(String title) throws BookNotFoundException, NoBooksAvailableException {

        Book b = findBook(title);

        if (b != null) {
            Integer count = bookCollection.get(b);   // get podaje wartość ze zbioru 2
            if (count > 10) {                       //jeśli ilość książek jest większa od 10 to wypożycz
                return super.borrow(title);
            } else {
                throw new IllegalArgumentException("Not enought books!");
            }
        } else {
            throw new BookNotFoundException("Not found");
        }


    }
}
