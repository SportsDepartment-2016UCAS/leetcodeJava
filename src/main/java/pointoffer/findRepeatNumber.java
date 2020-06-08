package pointoffer;

public class findRepeatNumber {
    public static int findRepeatNumber1(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }

        for (int i = 0;i<nums.length;i++) {
            while (nums[i] != i) {
                // 交换num[i]与num[num[i]]
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                } else {
                    int temp = nums[i];
                    nums[i] = nums[nums[i]];
                    nums[temp] = temp;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber1(nums));
    }
}
