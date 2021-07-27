package tophundred;

public class AddTwoNumbers_2 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }


        ListNode f1 = l1;
        ListNode f2 = l2;

        int add = 0;

        ListNode res = new ListNode();
        ListNode head = new ListNode();
        head = res;


        while (f1 != null && f2 != null) {

            int a = f1.val;
            int b = f2.val;

            ListNode listNode = new ListNode();
            if (a + b + add > 9) {
                listNode.val = (a + b + add) % 10;
                add = (a + b + add) / 10;
            } else {
                listNode.val = a + b + add;
                add = 0;
            }
            res.next = listNode;
            res = listNode;
            f1 = f1.next;
            f2 = f2.next;
        }

        while (f1 != null) {
            ListNode listNode = new ListNode();
            int a = f1.val;
            if (a + add > 9) {
                listNode.val = (a + add) % 10;
                add = (a + add ) / 10;
            } else {
                listNode.val = a + add;
                add = 0;
            }
            res.next = listNode;
            res = res.next;

            f1 = f1.next;
        }


        while (f2 != null) {
            ListNode listNode = new ListNode();
            int a = f2.val;
            if (a + add > 9) {
                listNode.val = (a + add) % 10;
                add = (a + add ) / 10;
            } else {
                listNode.val = a + add;
                add = 0;
            }
            res.next = listNode;
            res = res.next;

            f2 = f2.next;
        }

        if (add != 0) {
            res.next = new ListNode(add);
        }

        return head.next;
    }

    public static void main(String[] args) {

        ListNode one = new ListNode();
        ListNode a = new ListNode(9);
        one.next = a;
        a.next = new ListNode(9);
        a = a.next;
        a.next = new ListNode(9);
        a = a.next;
        a.next = new ListNode(9);
        a = a.next;
        a.next = new ListNode(9);
        a = a.next;
        a.next = new ListNode(9);
        a = a.next;
        a.next = new ListNode(9);
        a = a.next;


        ListNode b = new ListNode(9);
        b.next = new ListNode(9);
        b.next.next = new ListNode(9);
        b.next.next.next = new ListNode(9);

        ListNode listNode = addTwoNumbers(one.next, b);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }


}
