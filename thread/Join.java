package cn.ttw.thread;

/**
 * �����̣߳�join��������ǰ�߳���ͣ���ȴ�ָ���߳�ִ�н����󣬵�ǰ�߳��ټ���ִ��
 */

public class Join {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run(){
                for(int i = 0; i < 10; i++){
                    System.out.println(getName() + "---aaaaaaaa");
                }
            }
        };

        Thread t2 = new Thread() {
            public void run(){
                for(int i = 0; i < 10; i++){
                    if(i == 2){
                        try {
                            //t1.join();
                            t1.join(1);                 //���ָ����ʱ�䣬����ָ��ʱ��������߳̽���ִ��
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(getName() + "---bbb");
                }
            }
        };

        t1.start();
        t2.start();

    }
}
