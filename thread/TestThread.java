package cn.ttw.thread;

/**
 * �̳�Thread�ķ�ʽ
 *      �ô�������򵥣�����ֱ��ʹ��Thread���еķ���
 *      �׶ˣ�����Ѿ����˸��࣬�Ͳ��������ַ���
 *
 */

public class TestThread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();       //4.����Thread����������
        mt.start();                         //5.�����߳�

        for(int i = 0; i < 1000; i++){
            System.out.println("lalala");
        }

        //�����ڲ���ʵ���߳�
        new Thread(){                               //1.�̳�Thread��
            public void run(){                      //2.��дrun����
                for(int i = 0; i < 1000; i++){      //3.��Ҫִ�еĴ���д��run������
                    System.out.println("666");
                }
            }
        }.start();                                  //4.�����߳�






    }
}

class MyThread extends Thread {             //1.�̳�Thread
    public void run(){                      //2.��дrun����
        for(int i = 0; i < 1000; i++){      //3.��Ҫִ�еĴ���д��run������
            System.out.println("666");
        }
    }
}
