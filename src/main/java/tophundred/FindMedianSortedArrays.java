package tophundred;

public class FindMedianSortedArrays {


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int res = (m + n) / 2;
        int i = 0;
        int j = 0;
        int count = 0;
        if ((m + n) % 2 == 0) {
            // if 偶数,find res -1, res
            int a = 0;
            int b = 0;
            while (count <= res + 1) {
                int temp;

                if (i >= m) {
                    temp = nums2[j];
                    j++;
                } else if (j >= n) {
                    temp = nums1[i];
                    i++;
                } else if (nums1[i]<= nums2[j]) {
                    temp = nums1[i];
                    i++;
                } else {
                    temp = nums2[j];
                    j++;
                }

                count ++;

                if (count == res) {
                    a = temp;
                } else if (count == res + 1) {
                    b = temp;
                    return ( (double) a + (double) b ) / 2;
                }
            }

        } else {
            while (count <= res + 1) {
                int temp;
                if (i >= m) {
                    temp = nums2[j];
                    j++;
                } else if (j >= n) {
                    temp = nums1[i];
                    i++;
                } else if (nums1[i]<= nums2[j]) {
                    temp = nums1[i];
                    i++;
                } else {
                    temp = nums2[j];
                    j++;
                }
                count ++;
                if (count == res + 1) {
                    return temp;
                }

            }
        }

        return res;
    }


    public static void main(String[] args) {

        int[] nums1 = new int[] {1, 3};
        int[] nums2 = new int[] {2};

        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}
