package classic_150;

public class RemoveDuplicates_28 {

    /**
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     * 来源：力扣（LeetCode）
     * 链接：<a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii">...</a>
     * @param nums 有序数组
     * @return 数组长度
     */
    public int removeDuplicates(int[] nums) {

        int i = 0;
        int j = 0;

        int temp = nums[i];
        int dum = -1;
        for (; j < nums.length; j ++) {

            if (nums[j] == temp) {
                dum ++;
                if (dum < 2) {
                    nums[i] = nums[j];
                    i++;
                    temp = nums[j];
                }
            } else {
                nums[i] = nums[j];
                i++;
                temp = nums[j];
                dum = 0;
            }
        }

        return i;
    }

    public static void main(String[] args) {
//        int[] nums = {1,1,1,2,2,3};
        int[] nums = {0,0,1,1,1,1,2,3,3};
        RemoveDuplicates_28 removeDuplicates_28 = new RemoveDuplicates_28();
        int len = removeDuplicates_28.removeDuplicates(nums);
        System.out.println("len: " + len);

        for (int i : nums) {
            System.out.print(i + "" );
        }

    }
}
