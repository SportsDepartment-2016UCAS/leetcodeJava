package tophundred;

public class MergeTwoLists_21 {

    public static class ListNode {
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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode pre = new ListNode();
        ListNode head = pre;

        while (l1!=null && l2 != null) {

            ListNode temp;
            if (l1.val <= l2.val) {
                temp = new ListNode(l1.val);
                pre.next = temp;
                l1 = l1.next;
            } else {
                temp = new ListNode(l2.val);
                pre.next = temp;
                l2 = l2.next;
            }
            pre = temp;
        }

        if (l1 != null) {
            pre.next = l1;
        }

        if (l2 != null) {
            pre.next = l2;
        }

        return head.next;
    }



    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;

        ListNode r1 = new ListNode(1);
        ListNode r2 = new ListNode(3);
        ListNode r3 = new ListNode(4);
        r1.next = r2;
        r2.next = r3;

        ListNode listNode = mergeTwoLists(l1, r1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }
}
