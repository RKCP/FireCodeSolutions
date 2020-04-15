package Level2;

public class deleteNodePosition {

    // Examples:
    //
    // LinkedList: 1->2->3->4 , Head = 1
    //
    // deleteAtMiddle(Head,3) ==> 1->2->4


    // Traverse over to the required position. Use a temporary variable to hold the previous node and point its next reference to the next reference of the current node.

    public ListNode deleteAtMiddle(ListNode head, int position) {

        if (head == null) {
            return null;
        } else if (head.data == position) {
            return null;
        }
        ListNode temp = new ListNode(head.data);
        while (true) {
            if (head.next.data == position) {
                temp.next = (head.next).next;
                break;
            } else {
                head = head.next;
            }
        }

        return temp;



    }


    class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }
}
