package Level1;

public class findMiddleNode {

    // Given a Singly-Linked List, write a method - Level1.findMiddleNode that finds and returns the middle node of the list in a single pass.

    // The slow-fast pointer approach is very useful for finding the middle nodes of Linked Lists in a single pass.

    public ListNode findMiddleNode(ListNode head) {

        ListNode slow = head.next;
        ListNode fast = (head.next).next;

        while (true) {

            if (fast.next == null) {
                return slow;
            }
        }

    }

    class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }
}
