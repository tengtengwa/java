package cn.ttw.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutors {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);   //�����̳߳�
        pool.submit(new MyRunnable1());                                     //���̷߳Ž��̳߳���
        pool.submit(new MyRunnable1());

        pool.shutdown();                                                    //�ر��̳߳�

    }
}
