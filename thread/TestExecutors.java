package cn.ttw.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutors {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);   //创建线程池
        pool.submit(new MyRunnable1());                                     //将线程放进线程池中
        pool.submit(new MyRunnable1());

        pool.shutdown();                                                    //关闭线程池

    }
}
