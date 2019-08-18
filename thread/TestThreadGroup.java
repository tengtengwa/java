package cn.ttw.thread;

public class TestThreadGroup {
    public static void main(String[] args) {
        //test1();

        ThreadGroup tg = new ThreadGroup("����һ���µ��߳���");  //�����µ��߳�
        MyRunnable1 mr = new MyRunnable1();                             //����Runnable���������

        Thread t1 = new Thread(tg, mr, "zs");                   //���߳�t1��������
        Thread t2 = new Thread(tg, mr, "ls");                   //���߳�t2��������

        System.out.println(t1.getThreadGroup().getName());              //��ȡ����
        System.out.println(t2.getThreadGroup().getName());


    }

    public static void test1() {
        MyRunnable1 mr = new MyRunnable1();
        Thread t1 = new Thread(mr, "zs");
        Thread t2 = new Thread(mr, "ls");

        ThreadGroup tg1 = t1.getThreadGroup();
        ThreadGroup tg2 = t2.getThreadGroup();

        System.out.println(tg1.getName());      //Ĭ�������߳�
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