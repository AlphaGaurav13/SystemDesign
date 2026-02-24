// Test your implementation
public class main {
    public static void main(String[] args) {
        Book book = new Book("The Pragmatic Programmer", "David Thomas", "978-0135957059");
        book.displayInfo();

        boolean success = book.borrowBook();
        System.out.println("Borrow successful: " + success);
        book.displayInfo();

        success = book.borrowBook();
        System.out.println("Borrow successful: " + success);

        book.returnBook();
        book.displayInfo();
    }
}