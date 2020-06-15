package pointoffer;

public class majorityElement_39 {
    public static int majorityElement(int[] nums) {

        if (nums.length < 1) {
            return -1;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        // 收尾进行比较，当相等时+1，不相等时-1。当>0时，记录值。
        int i = 0;

        int votes = 0;
        int res = 0;
        while (i < nums.length) {
            if (votes <= 0 || res == nums[i]) {
                res = nums[i];
                votes++;
            } else {
                votes --;
            }

            if (votes >= nums.length) {
                return res;
            }

            i++;
        }
        return res;

    }

    public static void main(String[] args) {
        int[] a = {1,2,3,2,2,2,5,4,2};
        System.out.println(majorityElement(a));
    }
}
