/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class SearchBooks extends Library{
    private ListNode head;

    private class ListNode {

        private String data;
        private ListNode next;

        public ListNode(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void traversal() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    public void searchBook(String titile, String[] books) {
        for (String book : books) {
            if(book.equals(titile)) {
            System.out.println("The book has available");
            return;
            }
        }
        ListNode current = head;
        while(current != null) {
            if(current.data.equals(titile)) {
                System.out.println("Currently borrowed");
                return;
            }
            current = current.next;
        }
        System.out.println("Not in the library");
    }
}
