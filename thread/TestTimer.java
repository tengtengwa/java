package cn.ttw.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        //��������������ֱ�Ϊ�����ŵ�����ִ��ʱ��͹��೤ʱ�����ظ�ִ��
        t.schedule(new MyTimerTask(), new Date(119, 7, 1, 10, 56, 10), 2000);

        while (true) {
            Thread.sleep(1000);
            System.out.println(new Date());
        }

    }
}

class MyTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("��");
    }
}