package pointoffer.book_3;

public class Duplicate {

    public static int duplicate(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }

        int length = nums.length;
        for (int i = 0;i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                int temp = nums[i];
                nums[temp] = temp;
                nums[i] = temp;
            }
        }
//
//
//        int result = -1;
//        int i = 0;
//        while (i < length) {
//
//            if (nums[i] == i) {
//                i++;
//                continue;
//            }
//
//            if (nums[i] == nums[nums[i]]) {
//                result = nums[i];
//                break;
//            }
//            while (nums[i] != i) {
//                int x = nums[i];
//                int y = nums[x];
//                nums[i] = y;
//                nums[x] = x;
//            }
//            i ++;
//        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 11};
        System.out.println(duplicate(nums));
    }
}
