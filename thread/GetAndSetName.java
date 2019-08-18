package cn.ttw.thread;

/**
 * ���߳��������ֵ����ַ�ʽ
 * 1.����Thread�Ĺ��췽������������Ϊ��������
 * 2.setName����
 *
 */

public class GetAndSetName {
    public static void main(String[] args) {
        //test1();

        Thread t1 =  new Thread() {
            public void run() {
                //this.setName("�仨");
                System.out.println(this.getName() + "����666");
            }
        };


        Thread t2 =  new Thread() {
            public void run() {
                //this.setName("��ޱ");
                System.out.println(this.getName() + "����666666");
            }
        };

        t1.setName("����");
        t2.setName("����");
        t1.start();
        t2.start();

    }




    public static void test1() {
        new Thread("����") {
            public void run(){
                System.out.println(this.getName() + "����666");
            }
        }.start();

        new Thread("�绨") {
            public void run(){
                System.out.println(this.getName() + "����lalala");
            }
        }.start();
    }
}
