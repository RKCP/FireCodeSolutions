package Level1;

public class deleteHead {

    public ListNode deleteHead(ListNode head) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        } else if (head.next != null) {
            if ((head.next).next == null) {
                head.next = null;
            } else if ((head.next).next != null) {
                ((head.next).next).next = null;
            }
        }

        return head;

    }


    class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }
}
