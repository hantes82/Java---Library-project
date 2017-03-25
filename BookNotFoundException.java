package pkg3;

/**
 * Created by kondz on 19.03.2017.
 */
public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message) {
        super(message);
    }
}