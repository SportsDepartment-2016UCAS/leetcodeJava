package tophundred;

public class Jump_45 {

    public static int jump(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        int max = 0;
        int end = 0;
        int step = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            max = Math.max(max, i + nums[i]);

            if (i == end) {
                end = max;
                step ++;
            }

        }
        return step;
    }

    public static void main(String[] args) {


    }
}
