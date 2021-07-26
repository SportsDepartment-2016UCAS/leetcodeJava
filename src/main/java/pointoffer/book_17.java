package pointoffer;

public class book_17 {

    int[] res;
    int count = 0;
    int n = 0;
    int start;
    int nine = 0;

    char[] num;
    char[] loop = {'0', '1', '2', '3', '4','5','6','7','8','9'};

    public int[] printNumbers(int n) {
        this.n = n;
        res = new int[(int)Math.pow(10, n) - 1];

        num = new char[n];
        start = n - 1;
        dfs(0);
        return res;
    }

    private void dfs(int x) {

        if (x == n) {
            String s = String.valueOf(num).substring(start);
            if (!s.equals("0"))
                res[count++] = Integer.parseInt(s);
            if (n - start == nine) {
                start -- ;
            }
            return;
        }

        for (char i : loop) {
            if (i == '9') {
                nine ++ ;
            }
            num[x] = i;
            dfs(x + 1);
        }
        nine --;
    }

    public static void main(String[] args) {
        book_17 book_17 = new book_17();
        book_17.printNumbers(2);
    }

}
