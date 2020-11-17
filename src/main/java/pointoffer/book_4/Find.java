package pointoffer.book_4;

public class Find {

    public static boolean find(int[][] nums, int target) {
        boolean res = false;
        if (nums == null) {
            return res;
        }

        if (nums.length < 1 || nums[0].length < 1  ) {
            return res;
        }

        int x = nums.length;
        int y = nums[0].length;

        int i = 0;
        int j = 0;
        j = y - 1;
        int start;

        while (i < x && j > -1) {
            start = nums[i][j];
            if (start == target) {
                res = true;
                break;
            } else if (start < target) {
                i ++;
            } else {
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,8}, {2,4,9}, {4,7,10}, {6,8,11}};
        System.out.println(nums.length);
        System.out.println(nums[0].length);
//        int[][] nums = {{1,1}};
//        System.out.println(find(nums, 100));
    }
}
