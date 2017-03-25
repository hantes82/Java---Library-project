package pkg3;

/**
 * Created by kondz on 19.03.2017.
 */
public class App {

    public static void main(String[] args) {
        ILibrary library = new Library();
        ILibrary specificLibrary = new SpecificLibrary();
        Book book = library.findBook("The Moon");

        if (book != null) {
            System.out.println(book);
        }
        else {
            throw new BookNotFoundException ("Nie ma takiej książki w bibliotece");
        }




//       library.showLibrary();
//
//        Book book1 = library.findBook("Crazy Race");
//        if (book1 != null) {
//            System.out.println(library.borrow("Crazy Race"));
//           library.showLibrary();
//        }
//        else {
//            throw new BookNotFoundException ("Nie ma takiej książki w bibliotece");
//        }




//        Book book2 = library.findBook("Crazy Race");
//        if (book2 != null) {
//          library.returnBook(book2);
//          library.showLibrary();
//          library.increaseQuantity("Scary book",20);
//          library.showLibrary();
//          library.borrow("Crazy Race");
//          library.returnBook(book2);
//          library.withdrawBook("Crazy Race");
//          library.showLibrary();
//          library.changeBookTitle("Crazy Race","Red Lantern");
//          library.showLibrary();
//            library.getAvailableBooks();
//        }


    User jan = new User ("Jan Kowalski");
        jan.borrowBook(library , "The Moon");
        System.out.println(jan.getBorrowedBooks());


    }


}
