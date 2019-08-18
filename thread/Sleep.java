package cn.ttw.thread;

/**
 * 休眠线程Thread中的静态sleep方法
 */

public class Sleep {
    public static void main(String[] args) {
        //test();

        new Thread(){
            public void run(){
                for(int i = 0; i < 10; i++){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "---aaa");
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for(int i = 0; i < 10; i++){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "---bbb");
                }
            }
        }.start();

    }

    public static void test() throws InterruptedException {
        for(int i = 20; i >= 0; i--){
            Thread.sleep(500);
            System.out.println("倒计时" + i + "s");
        }
    }
}
