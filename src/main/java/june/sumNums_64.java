package june;

public class sumNums_64 {

    public int sumNums(int n) {

        // A&&B   A==True，则B肯定执行，所以A为递归条件，B为执行内容
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        //         boolean flag = n < 1 || (n += sumNums(n - 1)) < 2;
        return n;

    }

}
