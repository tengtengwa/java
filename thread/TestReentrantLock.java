package cn.ttw.thread;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {
    public static void main(String[] args) {
        Printer5 p = new Printer5();
        new Thread() {
            public void run() {
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
            public void run() {
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
            public void run() {
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

class Printer5 {

    private ReentrantLock r = new ReentrantLock();
    private Condition c1 = r.newCondition();
    private Condition c2 = r.newCondition();
    private Condition c3 = r.newCondition();

    private int flag = 1;
    ArrayList arr = new ArrayList();

    public void print1() throws InterruptedException {
        r.lock();
        if (flag != 1) {
            c1.await();
        }
        System.out.print("a");
        System.out.print("b");
        System.out.print("c");
        System.out.print("d");
        System.out.print("e");
        System.out.printf("\r\n");
        flag = 2;
        //this.notify();                  //随机唤醒单个等待的线程
        c2.signal();
        r.unlock();
    }

    public void print2() throws InterruptedException {
        r.lock();
        if (flag != 2){
            c2.await();
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
        c3.signal();
        r.unlock();
    }


    public void print3() throws InterruptedException {
        r.lock();
        if (flag != 3){
            c3.await();
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
        c1.signal();
        r.unlock();
    }
}