package tophundred;

public class MaxSubArray_53 {

    public static int maxSubArray(int[] nums) {

        if (nums == null || nums.length < 1) {
            return 0;
        }

        int max = nums[0];
        int sum = nums[0];
        for (int i = 1;i < nums.length; i++) {

            if (sum < 0) {
                sum = 0;
            }

            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int[] nums = new int[] {};
        int i = maxSubArray(nums);
        System.out.println(i);
    }
}
