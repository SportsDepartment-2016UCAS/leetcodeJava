package june;

public class sumNums_64 {

    public int sumNums(int n) {


        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;

    }

}
