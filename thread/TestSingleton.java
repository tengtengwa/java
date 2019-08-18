package cn.ttw.thread;

/**
 * 单例设计模式
 */

/**
 * 饿汉式和懒汉式的区别：
 * 1.饿汉式是空间换时间，懒汉式是时间换空间
 * 2.在多线程访问时，饿汉式不会创建多个对象，而懒汉式有可能创建多个对象
 *
 */

public class TestSingleton {
    public static void main(String[] args) {
//        Singleton s1 = new Singleton();
//          Singleton s1 = Singleton.s;           //成员变量被私有，不能通过类名.调用
//          Singleton.s = null;
//          Singleton s2 = Singleton.s;
//
//        System.out.println(s1 == s2);

        Singleton s1 = Singleton.s;
        Singleton s2 = Singleton.s;
        System.out.println(s1 == s2);

    }
}

/**
 * 饿汉式


class Singleton {
    //1.私有构造方法，其他类不能访问该构造方法
    private Singleton() {}
    //2.创建本类对象
    private static Singleton s = new Singleton();
    //3.对外提供公共访问方法
    public static Singleton getS() {
        return s;
    }

}
*/

/**
 * 懒汉式,单例的延迟加载模式


class Singleton {
    //1.私有构造方法，其他类不能访问该构造方法
    private Singleton() {}
    //2.创建本类对象
    private static Singleton s;
    //3.对外提供公共访问方法
    public static Singleton getS() {
        if(s == null) {
            s = new Singleton();
        }

        return s;
    }

}

 */



class Singleton {
    //1.私有构造方法，其他类不能访问该构造方法
    private Singleton() {}
    //2.创建本类对象
    public static final Singleton s = new Singleton();

}
