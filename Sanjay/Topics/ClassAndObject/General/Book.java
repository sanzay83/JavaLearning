package Sanjay.Topics.ClassAndObject.General;

public class Book {
    private static int totalNoOfBooks;

    static {
        System.out.println("inside static blocks");
        totalNoOfBooks = 0;
    }

    private String title, author, isbn;
    private boolean isBorrowed;

    {
        System.out.println("inside blocks");
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    public static void main(String[] args) {
        Student st = new Student("San", 27);
        System.out.println(Book.getTotalNoOfBooks());
        Book designOfThings = new Book("1", " Design", "Author");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }

    private void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book" + this.title);
        }
    }

    private void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Thank you for reading this book.");
        } else {
            System.out.println("This book is already in the library.");
        }
    }
}
