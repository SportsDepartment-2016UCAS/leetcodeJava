package contest.weekcontest267;

/**
 * @author zhangjie59
 * @date 2021/11/14 11:25
 **/
public class ReverseEvenLengthGroups {

    public ListNode reverseEvenLengthGroups(ListNode head) {

        int t = 1;
        ListNode preHead = head;
        ListNode cur = head;
        ListNode pre = head;
        ListNode c = head;
        while (cur != null) {
            int curCount = t;
            c = cur;
            int cnt = 0;
            while (cnt < t && c != null) {
                c = c.next;
                cnt++;
            }
            if (cnt % 2 == 1) {
                while (cur != null && curCount > 0) {
                    pre = cur;
                    cur = cur.next;
                    curCount--;
                }
            } else {
                ListNode temp = null;
                pre = preHead.next;
                while (cur != null && curCount > 0) {
                    temp = cur.next;
                    cur.next = preHead.next;
                    preHead.next = cur;
                    cur = temp;
                    pre.next = temp;
                    curCount--;
                }
            }
            preHead = pre;
            t++;
        }
        return head;

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
