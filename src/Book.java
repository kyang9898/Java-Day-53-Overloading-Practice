public class Book {

    private String titleOfBook;
    private int numberOfPages;
    private int yearPublished;

    public Book() {
        this.titleOfBook = "";
        this.numberOfPages = 0;
        this.yearPublished = 0;
    }

    public Book(String titleOfBook) {
        this.titleOfBook = titleOfBook;
        this.numberOfPages = 0;
        this.yearPublished = 0;
    }

    public Book(int yearPublished) {
        this.titleOfBook = "";
        this.numberOfPages = 0;
        this.yearPublished = yearPublished;
    }

    public Book(int yearPublished, String titleOfBook) {
        this.titleOfBook = titleOfBook;
        this.numberOfPages = 0;
        this.yearPublished = yearPublished;
    }

    public Book(String titleOfBook, int numberOfPages) {
        this.titleOfBook = titleOfBook;
        this.numberOfPages = numberOfPages;
        this.yearPublished = 0;
    }

    public Book(String titleOfBook, int numberOfPages, int yearPublished) {
        this.titleOfBook = titleOfBook;
        this.numberOfPages = numberOfPages;
        this.yearPublished = yearPublished;
    }

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return getTitleOfBook() + ", " + getNumberOfPages() + " pages, " + getYearPublished();
    }
}