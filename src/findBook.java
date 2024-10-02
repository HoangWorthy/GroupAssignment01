public class findBook extends Library{
    public static String search(Library library, BorrowedBooks borrowedBooks, String book){
        if(library.searchBook(book)) return "available";
        else if(borrowedBooks.searchForBook(book)) return "borrowed";
        return "not exist";
    }
}
