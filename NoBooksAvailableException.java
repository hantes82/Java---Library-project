package pkg3;

/**
 * Created by kondz on 19.03.2017.
 */
public class NoBooksAvailableException extends RuntimeException {

    public NoBooksAvailableException(String message) {
        super(message);
    }
}
