package cn.ttw.thread;

import java.util.ArrayList;

/**
 * ���������������߳�֮���ͨ��
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
 * ע��:
 * 1.��ͬ��������У����ĸ��������������ĸ��������wait����
 * 2.Ϊʲôwait������notify����������Object������
 *      ��Ϊ������������������Object��������Ļ��࣬����wait������notify����Ҫ������Object����
 * 3.sleep������wait����������
 *   a.sleep�������봫�������������ʱ�䣬ʱ�䵽���Զ�����
 *      wait�������Դ������Ҳ���Բ����룬������������ڲ�����ʱ�������ȴ����������������ֱ�ӵȴ�
 *   b.sleep������ͬ��������ͬ��������У����ͷ�����
 *      wait������ͬ��������ͬ����������ͷ���
 */


class PrinterO {

    private int flag = 1;
    ArrayList arr = new ArrayList();

    public void print1() throws InterruptedException {
        synchronized (this){
            while (flag != 1) {
                this.wait();                //��ǰ�̵߳ȴ�
            }
            System.out.print("a");
            System.out.print("b");
            System.out.print("c");
            System.out.print("d");
            System.out.print("e");
            System.out.printf("\r\n");
            flag = 2;
            //this.notify();                  //������ѵ����ȴ����߳�
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