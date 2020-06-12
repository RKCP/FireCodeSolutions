package Level1;

import java.util.*;

public class insertFrontList {

    // Write a method to insert a node at the front of a singly-linked list and return the head of the modified list.


    public ListNode insertAtHead(ListNode head, int data) {

        ListNode d = new ListNode(data);

        d.next = head;

        return d;

    }

    class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }
}
