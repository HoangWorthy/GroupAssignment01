public class ReturnBook extends Library{
    public static boolean returnBook(Library library, BorrowedBooks borrowedBooks, String book){
        if(borrowedBooks.searchForBook(book)){
            borrowedBooks.removeBook(book);
            library.addBook(book);
            return true;
        }
        return false;
    }
}
