package cn.ttw.thread;

/**
 * �ػ��߳�
 * �κ�һ���ػ��̶߳�������JVM�����з��ػ��̵߳ı�ķ��ֻҪ��ǰJVMʵ�����д����κ�һ�����ػ��߳�û�н������ػ��߳̾�ȫ��������
 * ֻ�е����һ�����ػ��߳̽���ʱ���ػ��߳�����JVMһͬ����������
 */

public class Daemon {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for(int i = 0; i < 2; i++){
                    System.out.println(getName() + "---aaaaaaaaa");
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for(int i = 0; i < 50; i++){
                    System.out.println(getName() + "---bbbbbbb");
                }
            }
        };

        t2.setDaemon(true);     //����trueʱ������Ϊ�ػ��߳�
        t1.start();
        t2.start();

    }
}
