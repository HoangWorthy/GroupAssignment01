import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        BorrowedBooks borrowedBooks = new BorrowedBooks();
        int choice;
        String title;
        while(true){
            System.out.println("1.Add a book to the library");
            System.out.println("2.Display all books in the library");
            System.out.println("3.Borrow a book from the library");
            System.out.println("4.Display all book borrowed from the library");
            System.out.println("5.Return a book to the library");
            System.out.println("6.Search a book in the library");
            System.out.println("7.Exit");
            System.out.println("Choice:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    title = sc.nextLine();
                    library.addBook(title);
                    break;
                case 2:
                    library.displayAllBooks();
                    break;
                case 3:
                    title = sc.nextLine();
                    borrowedBooks.borrowBook(library, title);
                    break;
                case 4:
                    borrowedBooks.displayBorrowedBooks();
                    break;
                case 5:
                    title = sc.nextLine();
                    if (ReturnBook.returnBook(library, borrowedBooks, title)){
                        System.out.println("Return success");
                    } else System.out.println("Return failed");
                    break;
                case 6:
                    title = sc.nextLine();
                    System.out.println("Books is " + findBook.search(library, borrowedBooks, title));
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}