/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ReturningBookstoTheLibrary extends Library {

    
    public class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
        
        
    }
    public class Node {
        Book book;
        Node next;

        public Node(Book book, Node next) {
            this.book = book;
            this.next = next;
        }
        
        
    }
    //ListBook manages borrowed book
    public class ListBook {
        Node head;

        public ListBook(Node head) {
            this.head = head;
        }
        public Book remove(String title) {
        Node current = head;
        Node prev = null;
                while(current != null) {
                    if(current.book.title.contains(title)) {
                    if(prev == null) {
                        head = current.next;
                    } else 
                        prev.next = current.next;
                        return current.book;
                    }
                    prev = current;
                    current = current.next;
                }return null;
                
        }
        // Method to return a borrowed book
        Library books = new Library();
        public void returnBook(String title) {
        Book returnedBook = this.remove(title);
        if (returnedBook != null) {
            books.addBook(returnedBook.title);
            System.out.println("Returned: " + returnedBook.title);
        } else {
            System.out.println("Book \"" + title + "\" not found in borrowed books.");
        }
        }
                
    }
    
    
    
}
