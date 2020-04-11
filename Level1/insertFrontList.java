package Level1;

import java.util.*;

public class insertFrontList {

    // Write a method to insert a node at the front of a singly-linked list and return the head of the modified list.


    public ListNode insertAtHead(ListNode head, int data) {

        ListNode newHead = new ListNode(data);

        if (head == null) {
            return newHead;
        } else {
            newHead.next = head;
        }

        return newHead;




    }

    class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }
}
