package Level2;

public class deleteTailCircular {

    public static ListNode deleteAtTail(ListNode head) {

        ListNode currentNode = head;
        ListNode previousNode = currentNode;

        while (currentNode.next != head) { // exits when we reach the tail, as the next node of currentNode will be the head
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        previousNode.next = head;

        return head;

    }

    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }

}
