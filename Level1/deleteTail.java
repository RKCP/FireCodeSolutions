package Level1;

public class deleteTail {

    // Given a singly-linked list, write a method to delete its last node and return the head.

    // Iterate to the second last node of the list and point its next to null.

    public ListNode deleteAtTail(ListNode head) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        if ((head.next).next == null) {
            return head.next;
        }

        if ((head.next).next != null) {
            return deleteAtTail((head.next).next);
        }

        return head;

    }


    class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }
}
