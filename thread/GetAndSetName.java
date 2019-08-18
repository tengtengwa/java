package cn.ttw.thread;

/**
 * 给线程设置名字的两种方式
 * 1.调用Thread的构造方法，将名字作为参数传入
 * 2.setName方法
 *
 */

public class GetAndSetName {
    public static void main(String[] args) {
        //test1();

        Thread t1 =  new Thread() {
            public void run() {
                //this.setName("翠花");
                System.out.println(this.getName() + "——666");
            }
        };


        Thread t2 =  new Thread() {
            public void run() {
                //this.setName("紫薇");
                System.out.println(this.getName() + "——666666");
            }
        };

        t1.setName("王五");
        t2.setName("赵六");
        t1.start();
        t2.start();

    }




    public static void test1() {
        new Thread("阿灿") {
            public void run(){
                System.out.println(this.getName() + "——666");
            }
        }.start();

        new Thread("如花") {
            public void run(){
                System.out.println(this.getName() + "——lalala");
            }
        }.start();
    }
}
