package classic_150;

public class Rotate_189 {

    /**
     * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
     * @param nums 整数数组
     * @param k 位数
     */
    public void rotate(int[] nums, int k) {

        if (k == 0 || k % nums.length == 0) {
            return;
        }

        int offset = k % nums.length;

        // 1.第一次反转
        for (int i = 0, j = nums.length -1; i < j; i ++,j--) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }

        // 2.右侧反转
        for (int i = offset, j = nums.length - 1; i < j; i++,j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // 3. 左侧反转
        for (int i = 0, j = offset -1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }


    // 优秀题解：
    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7};
//        int k = 3;

//        int[] nums = {-1,-100,3,99};
//        int k = 2;
        int[] nums = {-1,-100,3,99};
        int k = 3;

        Rotate_189  rotate_189 = new Rotate_189();
        rotate_189.rotate(nums, k);

        for (int i : nums) {
            System.out.printf(i + " ");
        }
    }
}
