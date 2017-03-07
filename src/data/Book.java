package data;

public class Book {
    // Pola
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    // settery i gettery
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Konstruktory
    public Book(String title, String author, int releaseDate, int pages, String publisher,
                String isbn) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setReleaseDate(releaseDate);
        this.setPages(pages);
        this.setPublisher(publisher);
        this.setIsbn(isbn);
    }

    public Book(Book book) {
        this(book.getTitle(), book.getAuthor(), book.getReleaseDate(), book.getPages(), book
                .getPublisher(), book.getIsbn());
    }

    public void printInfo() {
        String info = getTitle() + "; " + getAuthor() + "; " + getReleaseDate() + "; " + getPages()
                + "; " + getPublisher() + "; " + getIsbn();
        System.out.println(info);
    }
}
