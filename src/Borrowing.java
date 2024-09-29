
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nguyen Anh Khoi
 */
public class Borrowing extends Library {

    private ListNode head;

    private class ListNode {

        private String data;
        private ListNode next;

        public ListNode(String data) {
            this.data = data;
            this.next = next;
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
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void addBook(String title, String[] books) {

        for (String book : books) {
            if (book == null) {
                break;
            }
            if (book.equalsIgnoreCase(title)) {
                insertEnd(title);
                return;
            }
        }
        System.out.println("Not exist or borrowed!");
    }

    public void displayBorrowedBooks() {
        traversal();
    }

}
