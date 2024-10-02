/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nguyen Anh Khoi
 */
public class BorrowedBooks extends Library {

    private ListNode head;

    private static class ListNode {

        private String data;
        private ListNode next;

        public ListNode(String data) {
            this.data = data;
            this.next = null;
        }

    }

    public void insertEnd(String data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void traversal() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean searchForBook(String book){
        ListNode current = head;
        while(current!= null && !current.data.equalsIgnoreCase(book)){
            current = current.next;
        }
        return current != null;
    }

    public void removeBook(String book){
        if(head == null) return;
        if(head.data.equalsIgnoreCase(book)){
            head = head.next;
            return;
        }
        ListNode current = head;
        while(current.next!= null && !current.next.data.equalsIgnoreCase(book)) {
            current = current.next;
        }
        if(current.next == null){
            current = null;
            return;
        }
        current.next = current.next.next;
    }

    public void borrowBook(Library library, String title) {
        String[] books = library.getBooks();
        for (String book : books) {
            if (book == null) {
                break;
            }
            else if (book.equalsIgnoreCase(title)) {
                insertEnd(title);
                library.removeBook(title);
                System.out.println("Borrow success");
                return;
            }
        }
        System.out.println("Not exist or borrowed!");
    }

    public void displayBorrowedBooks() {
        traversal();
    }

}
