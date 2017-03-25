package pkg3;

/**
 * Created by itml on 19.03.2017.
 */
public class Book implements IBook {
    //pola klasy
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private int bookState = 0;


    //Sets


    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setBookState(int bookState) {this.bookState = bookState;}

    //Gets
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getPages() {
        return pages;
    }
    public int getBookState() {return bookState;}



    //Constructors
         public Book() {
        }

    public Book(String title, String author, String isbn, int pages) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.pages = pages;

        }

        //Methods
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pages=" + pages +
                '}';
    }
}