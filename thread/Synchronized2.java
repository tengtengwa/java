package cn.ttw.thread;

import java.util.ArrayList;

public class Synchronized2 {
    public static void main(String[] args) {
        Printer p = new Printer();

        new Thread() {
            public void run(){
                while (true){
                    p.print1();
                }
            }
        }.start();

        new Thread() {
            public void run(){
                while (true){
                    p.print2();
                }
            }
        }.start();


    }
}

class Printer2 {

    ArrayList arr = new ArrayList();

    //�Ǿ�̬��ͬ����������������ʲô��   ��this
    //��̬��ͬ��������������ʲô��       �Ǹ�����ֽ������
    public static synchronized void print1() {
            System.out.print("a");
            System.out.print("b");
            System.out.print("c");
            System.out.print("d");
            System.out.print("e");
            System.out.printf("\r\n");
    }

    public static synchronized void print2() {
        synchronized (Printer2.class){
            System.out.print("1");
            System.out.print("2");
            System.out.print("3");
            System.out.print("4");
            System.out.print("5");
            System.out.print("6");
            System.out.print("7");
            System.out.print("8");
            System.out.printf("\r\n");
        }
    }
}