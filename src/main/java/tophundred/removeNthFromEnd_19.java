package tophundred;

public class removeNthFromEnd_19 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        while (first != null) {
            second = second.next;
            first = first.next;
        }

        second.next = second.next.next;


        while (dummy.next != null) {
            System.out.println(dummy.next.val);
            dummy = dummy.next;
        }

        return dummy.next;


    }



    public static void main(String[] args) {

        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);

        removeNthFromEnd(one, 2);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
