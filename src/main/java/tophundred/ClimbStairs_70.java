package tophundred;

public class ClimbStairs_70 {

    public static int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int[] array = new int[n];
        for (int i : array) {
            array[i] = 0;
        }

        array[0] = 0;
        array[1] = 1;
        array[2] = 2;


        for (int i = 3; i < n; i ++) {
            array[i] = array[i - 1] + array[i -2];
        }
        return array[n-1] + array[n - 2];

    }

    public static void main(String[] args) {

        int i = climbStairs(10);
        System.out.println(i);
    }
}
