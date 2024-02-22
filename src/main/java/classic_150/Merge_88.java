package classic_150;

public class Merge_88 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // 从后往前来做数据的转移
        int i = m - 1;
        int j = n - 1;

        int k = nums1.length - 1;

        while(i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // 可以忽略，因为本身就是在第一个数组中剩余的内容
//        while (i >= 0) {
//            nums1[k--] = nums1[i--];
//        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {

//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;

//        int[] nums1 = {1};
//        int m = 1;
//        int[] nums2 = {};
//        int n = 0;


        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        Merge_88 o = new Merge_88();
        o.merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.print(i);
        }
    }

}
