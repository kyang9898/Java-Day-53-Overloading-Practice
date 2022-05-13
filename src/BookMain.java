import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

    Book newBook = new Book();
    Book newBookTitle = new Book("Her Last Goodbye");
    Book bookYearPublished = new Book(2022);
    Book bookYearPublishedAndTitle = new Book(2022, "One Italian Summer");
    Book bookTitleAndPageCount = new Book("How High We Go In The Dark", 304);

    public static void main(String[] args) throws Exception {
        ArrayList<Book> booksList = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in);
        booksList.add(new Book("Project Hail Mary", 476, 2021));
        booksList.add(new Book("The Four Winds", 464, 2021));
        booksList.add(new Book("Malibu Rising", 369, 2021));
        booksList.add(new Book("A Court Of Silver Flames", 757, 2021));
        booksList.add(new Book("The Diamond Eye", 435, 2022));
        while (true) {
            System.out.println("What information will be printed?");
            System.out.println("Enter nothing to exit.");
            String book = scanner.nextLine();
            if (book.equalsIgnoreCase("Everything")) {
                for (int i = 0; i < booksList.size(); i++) {
                    System.out.println(booksList.get(i));
                }
            } else if (book.equalsIgnoreCase("Name")) {
                for (int i = 0; i < booksList.size(); i++) {
                    System.out.println(booksList.get(i).getTitleOfBook());
                }
            } else if (book.isEmpty()) {
                break;
            }
        }
    }
}