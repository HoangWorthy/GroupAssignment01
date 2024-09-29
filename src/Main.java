public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Borrowing borrow = new Borrowing();
        library.addBook("hello");
        library.addBook("hello1");
//        library.displayAllBooks();
        borrow.addBook("hello1", library.getBooks());
        borrow.addBook("hello", library.getBooks());
        borrow.displayBorrowedBooks();
    }
}