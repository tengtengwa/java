package cn.ttw.thread;

/**
 * ʵ��Runnable�ķ�ʽ��
 *      �ô�����ʹ�Լ�������߳������˸���Ҳû��ϵ����Ϊ���˸���Ҳ����ʵ�ֽӿڣ����ҽӿ��Ƕ�ʵ�ֵ�
 *      �׶ˣ����븴�ӣ�����ֱ����Ҫ��Thread�еķ�������Ҫ�Ȼ�ȡ�̶߳�������ʹ��Thread�еķ���
 *
 */

public class TestThread2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();   //4.����Runnable���������
        //Runnable taget = mr;  mr = 0x0011
        Thread t = new Thread(mr);          //5.������Ϊ��������Thread�Ĺ��캯��
        t.start();                          //6.�����߳�


        //�����ڲ���ʵ���߳�
        new Thread(new Runnable() {                 //1.��Runnable��������󴫵ݸ�Thread�Ĺ��췽��
            public void run() {                     //2.��дrun�Ƿ�
                for (int i = 0; i < 1000; i++) {    //3.��Ҫִ�еĴ���д��run������
                    System.out.println("666666");
                }
            }
        }).start();                                 //4.�����߳�



    }
}

    class MyRunnable implements Runnable {      //1.����һ����ʵ��Runnable

        public void run() {                      //2.��дrun����
            for (int i = 0; i < 1000; i++) {      //3.��Ҫִ�еĴ���д��run������
                System.out.println("666");
            }
        }

    }
