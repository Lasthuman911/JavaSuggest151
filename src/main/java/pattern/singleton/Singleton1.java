package pattern.singleton;

/**
 * 饿汉模式：在类加载的时候就创建了此类的唯一实例
 * Created by lszhen on 2017/12/19.
 */
public class Singleton1 {
    /**
     * 将构造函数设置为private，不允许客户端通过new来创建此类的实例
     */
    private Singleton1() {
    }

    /**
     * 构造函数已经是private了，意味者外部不能通过构造此类对象来调用instance，所以要设置为static
     * 为了安全考虑，不允许外部直接访问类的成员变量，提供一个方法进行访问，所以设置为private
     */
    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance(){
        return instance;
    }
}
