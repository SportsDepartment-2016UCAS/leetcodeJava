package augest;

/**
 * 剔除法，比排序取中间值的效率更高
 */
public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3,3,3,1,3};

        int res = nums[0];
        int count = 1;
        for (int i = 1; i<nums.length;i++) {
            if (count == 0) {
                res = nums[i];
                count ++;
                continue;
            }

            if (nums[i] != res) {
                count--;
            } else {
                count++;
            }

        }
        System.out.println(res);


    }
}
