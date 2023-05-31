package classic_150;

import sun.security.x509.RDN;

public class RemoveDuplicates_26 {


    /**
     * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
     *
     * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
     *
     * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums的其余元素与 nums 的大小不重要。
     * 返回 k。
     *
     * 来源：力扣（LeetCode）
     * 链接：<a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array">...</a>
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums 给定数组
     * @return
     */
    public int removeDuplicates(int[] nums) {

        int i = 1;
        int j = 1;

        int temp = nums[0];
        for (;j < nums.length; j++) {
            if (nums[j] != temp) {
                nums[i] = nums[j];
                i++;
                temp = nums[j];
            }
        }

        return i;

    }

    public static void main(String[] args) {

//        int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        RemoveDuplicates_26 removeDuplicates_26 = new RemoveDuplicates_26();
        int i = removeDuplicates_26.removeDuplicates(nums);
        System.out.println("len: " + i);

        for (int j = 0; j < nums.length; j ++) {
            System.out.println(nums[j]);
        }

    }
}
