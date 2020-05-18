package Level2;

public class deleteMiddleNode {

    public static ListNode deleteAtMiddle(ListNode head, int position) {

        if (head == null) {
            return null;
        }
        
        if (position == 1) {
            return head.next;
        }
        
        int count = 1;
        ListNode current = head;
        ListNode previous = current;
        
        while (count != position) {
            previous = current;
            current = current.next;
            count++;
            if (current == null) {
                return head;
            }
        }
        
        previous.next = current.next;

        return head;

    }
}
