package cn.ttw.thread;

/**
 * �̰߳�ȫ����
 */

public class Ticket {
    public static void main(String[] args) {
        new Tick().start();
        new Tick().start();
        new Tick().start();
        new Tick().start();


    }
}

class Tick extends Thread {
    private static int ticket = 100;

    public void run() {
        while (true){
            synchronized (Tick.class){
                if(ticket <= 0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(getName() + "���ǵ�" + ticket-- + "��Ʊ");
        }
    }

}