package classic_150;

public class RemoveElement_27 {


    /**
     * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     *
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     *
     * 来源：力扣（LeetCode）
     * 链接：<a href="https://leetcode.cn/problems/remove-element">...</a>
     * @param nums 给定数组
     * @param val 确定的值
     * @return 返回值
     */
    public int removeElement(int[] nums, int val) {

        int i = 0;
        int j = 0;

        for (;j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] =  nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {

//        case 1
//        int[] nums = {1,2,3,3};
//        int val = 2;

//        case 2
//        int[] nums = {1,2,3,3};
//        int val = 3;

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;


        RemoveElement_27 removeElement_27 = new RemoveElement_27();
        int len = removeElement_27.removeElement(nums, val);
        System.out.println("len:" + len);
        for (int  i = 0; i < len; i ++) {
            System.out.println(nums[i]);
        }
    }
}
