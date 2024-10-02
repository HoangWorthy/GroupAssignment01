public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        BorrowedBooks borrowedBooks = new BorrowedBooks();
        library.addBook("aaa");
        library.addBook("ccc");
        library.addBook("bbb");
        library.displayAllBooks();
        borrowedBooks.borrowBook(library,"bbb");
        ReturnBook.returnBook(library,borrowedBooks,"bbb");
        System.out.println(findBook.search(library,borrowedBooks,"bbb"));
    }
}