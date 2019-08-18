package cn.ttw.thread;

public class setPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for(int i = 0; i < 100; i++){
                    System.out.println(getName() + "---aaaaaa");
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for(int i = 0; i < 100; i++){
                    System.out.println(getName() + "---666666666");
                }
            }
        };

//        t1.setPriority(10);
//        t2.setPriority(1);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

    }
}
