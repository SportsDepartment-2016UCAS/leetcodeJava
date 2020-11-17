package pointoffer.book_2;

public class SingletonClass {

    /**
     * from:https://blog.csdn.net/faker7/article/details/105622466
     * 如果不使用volatile关键字，使用方在调用getInstance方法时，有可能会得到未初始化完成的对象。
     * 因为对java编译器而言，初始化singleton实例和将对象地址写入singleton字段非原子操作，且两个阶段的执行顺序是未定义的。
     *
     * （1）初始化singleton实例
     * （2）静态成员变量singleton指向该地址，即将堆地址赋值给singleton字段
     *
     * 假设某线程执行new singleton()时，先执行（2），此时，另一个线程调用getInstance方法，singleton!=null，
     * 会直接返回一个不正确的singleton单例对象，因为此时（1）还没有执行成功，即对象里面的成员变量没有完成赋值，还是默认值。
     * volatile关键字修饰目标属性，这样singleton限制了编译器对它的读写操作进行指令重排，确定对象实例化后才返回引用。
     */
    private static volatile SingletonClass instance = null;

    private SingletonClass() { }

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }
}
