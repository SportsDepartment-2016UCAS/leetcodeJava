package contest.weekcontest267;


/**
*
*
* @author zhangjie59
* @date 2021/11/14 10:49
**/
public class TimeRequiredToBuy {

    public static int timeRequiredToBuy(int[] tickets, int k) {

        if (tickets.length < 1 || k < 0) {
            return -1;
        }

        int level = tickets[k];
        int count = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i<=k) {
                if (tickets[i] < level) {
                    count += tickets[i];
                } else {
                    count += level;
                }
            } else {
                if (tickets[i] < level) {
                    count += tickets[i];
                } else {
                    count += level - 1;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[] tickets = {2, 3, 2};
//        int[] tickets = {5,1,1,1};
        int k = 2;

        int i = timeRequiredToBuy(tickets, k);

        System.out.println("" + i);

    }


}
