import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    String ISBN;
    boolean availability;

    public Book(String title, String author, String ISBN, boolean availability) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = availability;
    }
}

class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) {
        for (Book book : books) {
            if (book.ISBN.equals(ISBN)) {
                books.remove(book);
                break;
            }
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("Availability: " + book.availability);
            System.out.println();
        }
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine(); // to consume the newline character
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter ISBN: ");
                String ISBN = scanner.nextLine();
                System.out.print("Enter availability: ");
                boolean availability = scanner.nextBoolean();
                library.addBook(new Book(title, author, ISBN, availability));
            } else if (choice == 2) {
                scanner.nextLine(); // to consume the newline character
                System.out.print("Enter ISBN: ");
                String ISBN = scanner.nextLine();
                library.removeBook(ISBN);
            } else if (choice == 3) {
                library.displayBooks();
            } else if (choice == 4) {
                break;
            }
        }

        scanner.close();
    }
}