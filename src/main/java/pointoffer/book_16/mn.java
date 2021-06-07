package pointoffer.book_16;

/**
 * 求小树m的n次方
 */
public class mn {

    public double mn(double m, int n) {

        if (m == 0 ) {
            return 0;
        }

        int n_abs = Math.abs(n);

        double result = methodA(m, n_abs);
        if (n < 0) {
            result = 1 / result;
        }

        return result;
    }

    public double methodA(double m, int n) {

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return m;
        }

//        double res = methodA(m, n >> 1);
//        res *= res;
//
//
//        if ((n & 1) == 1) {
//            res *= m;
//        }

        double res = m;
        for (int i = 1; i < n; i++) {
            res *= m;
        }

        return res;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.currentTimeMillis());
        mn n = new mn();
        double res= 0;
        for (int i = 0; i < 1000; i++) {
//            System.out.println(System.currentTimeMillis());
            res = n.mn(12.343425222242, 1236);
            Thread.sleep(10);
        }
        System.out.println(res + "");
        System.out.println(System.currentTimeMillis());

        /**
         * 1621953079364
         * 1.0582419997547272E75
         * 1621953090218
         *
         *
         * 1621953109265
         * 1.0582419997547264E75
         * 1621953120151
         *
         *
         * 1621953147042
         * 3.791603637393198E257
         * 1621953157925
         */
    }



}
