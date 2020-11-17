package pointoffer.book_2;

public class SingletonStatic {

    /**
     * 内部类实现初始化，利用了jvm的类加载机制
     */
    static class SingletonHolder{
        private static final SingletonStatic instance = new SingletonStatic();
    }

    public static SingletonStatic getInstance() {
        return SingletonHolder.instance;
    }

    private SingletonStatic() {}
}
