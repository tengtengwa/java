package cn.ttw.thread;

/**
 * 守护线程
 * 任何一个守护线程都是整个JVM中所有非守护线程的保姆：只要当前JVM实例中尚存在任何一个非守护线程没有结束，守护线程就全部工作；
 * 只有当最后一个非守护线程结束时，守护线程随着JVM一同结束工作。
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

        t2.setDaemon(true);     //传入true时即设置为守护线程
        t1.start();
        t2.start();

    }
}
