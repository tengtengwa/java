package cn.ttw.thread;

/**
 * ��ȡ��ǰ�̣߳�ʹ��Thread�ľ�̬������currentThread����
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
                System.out.println(Thread.currentThread().getName() + "---bbb");    //��ȡ��ǰ����ִ�е��߳�
            }
        }).start();

        Thread.currentThread().setName("���߳�");
        System.out.println(Thread.currentThread().getName());


    }
}
