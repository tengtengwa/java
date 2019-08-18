package cn.ttw.thread;

public class TestThreadGroup {
    public static void main(String[] args) {
        //test1();

        ThreadGroup tg = new ThreadGroup("我是一个新的线程组");  //创建新的线程
        MyRunnable1 mr = new MyRunnable1();                             //创建Runnable的子类对象

        Thread t1 = new Thread(tg, mr, "zs");                   //将线程t1放在组中
        Thread t2 = new Thread(tg, mr, "ls");                   //将线程t2放在组中

        System.out.println(t1.getThreadGroup().getName());              //获取组名
        System.out.println(t2.getThreadGroup().getName());


    }

    public static void test1() {
        MyRunnable1 mr = new MyRunnable1();
        Thread t1 = new Thread(mr, "zs");
        Thread t2 = new Thread(mr, "ls");

        ThreadGroup tg1 = t1.getThreadGroup();
        ThreadGroup tg2 = t2.getThreadGroup();

        System.out.println(tg1.getName());      //默认是主线程
        System.out.println(tg2.getName());
    }
}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}