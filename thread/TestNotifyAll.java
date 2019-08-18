package cn.ttw.thread;

import java.util.ArrayList;

/**
 * 三个或三个以上线程之间的通信
 */

public class TestNotifyAll {
    public static void main(String[] args) {
        PrinterO p = new PrinterO();
        new Thread() {
            public void run(){
                while (true){
                    try {
                        p.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {
            public void run(){
                while (true){
                    try {
                        p.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {
            public void run(){
                while (true){
                    try {
                        p.print3();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}


/**
 * 注意:
 * 1.在同步代码块中，用哪个对象锁，就用哪个对象调用wait方法
 * 2.为什么wait方法和notify方法定义在Object这类中
 *      因为锁对象可以是任意对象，Object是所有类的基类，所以wait方法和notify方法要定义在Object类中
 * 3.sleep方法和wait方法的区别？
 *   a.sleep方法必须传入参数，参数是时间，时间到了自动醒来
 *      wait方法可以传入参数也可以不传入，传入参数就是在参数的时间结束后等待，不传入参数就是直接等待
 *   b.sleep方法在同步函数或同步代码块中，不释放锁，
 *      wait方法在同步函数或同步代码块中释放锁
 */


class PrinterO {

    private int flag = 1;
    ArrayList arr = new ArrayList();

    public void print1() throws InterruptedException {
        synchronized (this){
            while (flag != 1) {
                this.wait();                //当前线程等待
            }
            System.out.print("a");
            System.out.print("b");
            System.out.print("c");
            System.out.print("d");
            System.out.print("e");
            System.out.printf("\r\n");
            flag = 2;
            //this.notify();                  //随机唤醒单个等待的线程
            this.notifyAll();
        }
    }

    public synchronized void print2() throws InterruptedException {
        synchronized (this){
            while (flag != 2){
                this.wait();
            }
            System.out.print("1");
            System.out.print("2");
            System.out.print("3");
            System.out.print("4");
            System.out.print("5");
            System.out.print("6");
            System.out.print("7");
            System.out.print("8");
            System.out.printf("\r\n");
            flag = 3;
            //this.notify();
            this.notifyAll();
        }
    }


    public synchronized void print3() throws InterruptedException {
        synchronized (this){
            while (flag != 3){
                this.wait();
            }
            System.out.print("m");
            System.out.print("a");
            System.out.print("t");
            System.out.print("o");
            System.out.print("n");
            System.out.print("g");
            System.out.printf("\r\n");
            flag = 1;
            //this.notify();
            this.notifyAll();
        }
    }
}