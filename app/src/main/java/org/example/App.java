public class App {
    public static void main(String[] args) {
        Library library = new Library();
        
        // Add books
        library.addBook(new Book("1", "Java Basics", "Author A"));
        library.addBook(new Book("2", "Advanced Java", "Author B"));

        // Add patrons
        Patron patron = new Patron("P1", "John Doe");
        library.addPatron(patron);

        // Borrow and return books
        library.lendBook("1", "P1");
        library.displayAvailableBooks();
        library.returnBook("1", "P1");
    }
}
