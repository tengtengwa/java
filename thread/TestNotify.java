package cn.ttw.thread;

import java.util.ArrayList;

public class TestNotify {
    public static void main(String[] args) {
        Printer6 p = new Printer6();

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

    }

}


//�ȴ����ѻ���
class Printer6 {

    private int flag = 1;
    ArrayList arr = new ArrayList();

    public void print1() throws InterruptedException {
        synchronized (this){
            if(flag != 1) {
                this.wait();                //��ǰ�̵߳ȴ�
            }
            System.out.print("a");
            System.out.print("b");
            System.out.print("c");
            System.out.print("d");
            System.out.print("e");
            System.out.printf("\r\n");
            flag = 2;
            this.notify();                  //������ѵ����ȴ����߳�
        }
    }

    public synchronized void print2() throws InterruptedException {
        synchronized (this){
            if(flag != 2){
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
            flag = 1;
            this.notify();
        }
    }
}