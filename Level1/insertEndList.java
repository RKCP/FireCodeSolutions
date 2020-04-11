package Level1;

public class insertEndList {

    // Write a method to insert a node at the end of a singly-linked list. Return the head of the modified list.

    // This one is simple. Create a ListNode node with the input data, iterate over to the end of the list and
    // append this new node to the end of the list by setting the next pointer of the last node to point to the newly created node.

    public static ListNode insertAtTail(ListNode head, int data) {

        if (head == null) {
            return head = new ListNode(data);
        }


        if (head.next != null) {

            if ((head.next).next == null) {
                (head.next).next = new ListNode(data);
            }
        } else {
            head.next = new ListNode(data);
        }


        return head;




//        if (head == null) {
//            return head = new ListNode(data);
//        }
//
//        if (head.next == null) {
//            head.next = new ListNode(data);
//        } else {
//            return new ListNode(insertAtTail(head.next, data));
//        }
//
//        return head;

    }


    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }


    public static void main(String[] args) {
        //System.out.println(insertAtTail(new ListNode(1), 2));

    }

}
