package cn.ttw.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        //三个参数的意义分别为：安排的任务，执行时间和过多长时间再重复执行
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
        System.out.println("起床");
    }
}