package cn.ttw.thread;

/**
 * 获取当前线程：使用Thread的静态方法：currentThread方法
 */

public class CurrentThread {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println(getName() + "---aaaaa");
            }
        }.start();

        new Thread(new Runnable(){
            public void run(){
                System.out.println(Thread.currentThread().getName() + "---bbb");    //获取当前正在执行的线程
            }
        }).start();

        Thread.currentThread().setName("猪线程");
        System.out.println(Thread.currentThread().getName());


    }
}
