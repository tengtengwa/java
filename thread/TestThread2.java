package cn.ttw.thread;

/**
 * 实现Runnable的方式：
 *      好处：即使自己定义的线程类有了父类也没关系，因为有了父类也可以实现接口，而且接口是多实现的
 *      弊端：代码复杂，不能直接是要用Thread中的方法，需要先获取线程对象后才能使用Thread中的方法
 *
 */

public class TestThread2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();   //4.创建Runnable的子类对象
        //Runnable taget = mr;  mr = 0x0011
        Thread t = new Thread(mr);          //5.将其作为参数传给Thread的构造函数
        t.start();                          //6.开启线程


        //匿名内部类实现线程
        new Thread(new Runnable() {                 //1.将Runnable的子类对象传递给Thread的构造方法
            public void run() {                     //2.重写run非法
                for (int i = 0; i < 1000; i++) {    //3.将要执行的代码写在run方法中
                    System.out.println("666666");
                }
            }
        }).start();                                 //4.开启线程



    }
}

    class MyRunnable implements Runnable {      //1.定义一个类实现Runnable

        public void run() {                      //2.重写run方法
            for (int i = 0; i < 1000; i++) {      //3.将要执行的代码写在run方法中
                System.out.println("666");
            }
        }

    }
