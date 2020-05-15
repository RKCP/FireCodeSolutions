package Level2;

import java.util.List;

public class deleteHeadCircular {

    // Given a circular linked list, implement a method to delete its head node. Return the list's new head node.

    // *x = indicates head node
    // 1->2->3->4->*1 ==> 2->3->4->*2


    public static ListNode deleteAtHead(ListNode head) {

        if (head == null || head.next == head) {
            return null;
        }

        ListNode current = head;

        while (current.next != head) {
            current = current.next;
        }

        current.next = head.next;
        head = current.next;

        return head;

    }



    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }

}
