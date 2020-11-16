package pointoffer.book_1;

public class book1 {

    /**
     * 类的静态变量是可以通过引用实例来修改的
     */
    public static void main(String[] args) {
        A.Numbers = 10;
        A number = new A();
        number.setNumbers(5);
        System.out.println(A.Numbers);
        number.setNumbers(6);
        System.out.println(A.Numbers);
    }

}

