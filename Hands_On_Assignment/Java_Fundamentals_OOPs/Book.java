package tasksprograms;
import java.util.Scanner;

public class Book {
    // Fields
    private String ISBN;
    private String titleOfBook;
    private String authorName;
    private String publisher;
    private int year;
    private double price;

    // Constructor
    public Book(String ISBN, String titleOfBook, String authorName, String publisher, int year, double price) {
        this.ISBN = ISBN;
        this.titleOfBook = titleOfBook;
        this.authorName = authorName;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }

    public String getTitleOfBook() {
		return titleOfBook;
	}

	public void setTitleOfBook(String titleOfBook) {
		this.titleOfBook = titleOfBook;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	// Getter for ISBN (used for sorting)
    public String getISBN() {
        return ISBN;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + titleOfBook);
        System.out.println("Author: " + authorName);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Price: ?" + price);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];

        // Input 5 book records
        for (int i = 0; i < books.length; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();

            System.out.print("Enter Title of Book: ");
            String title = sc.nextLine();

            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            System.out.print("Enter Publisher: ");
            String publisher = sc.nextLine();

            System.out.print("Enter Year: ");
            int year = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Price: ");
            double price = Double.parseDouble(sc.nextLine());

            books[i] = new Book(isbn, title, author, publisher, year, price);
        }

        // Sort the books by ISBN using Bubble Sort
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j].getISBN().compareTo(books[j + 1].getISBN()) > 0) {
                    // Swap
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }

        // Display all sorted books
        System.out.println("\n--- Sorted Book List (by ISBN) ---");
        for (Book book : books) {
            book.displayDetails();
        }

        sc.close();
    }
}
