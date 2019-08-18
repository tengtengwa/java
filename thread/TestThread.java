package cn.ttw.thread;

/**
 * 继承Thread的方式
 *      好处：代码简单，可以直接使用Thread类中的方法
 *      弊端：如果已经有了父类，就不能用这种方法
 *
 */

public class TestThread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();       //4.创建Thread类的子类对象
        mt.start();                         //5.开启线程

        for(int i = 0; i < 1000; i++){
            System.out.println("lalala");
        }

        //匿名内部类实现线程
        new Thread(){                               //1.继承Thread类
            public void run(){                      //2.重写run方法
                for(int i = 0; i < 1000; i++){      //3.将要执行的代码写在run方法中
                    System.out.println("666");
                }
            }
        }.start();                                  //4.开启线程






    }
}

class MyThread extends Thread {             //1.继承Thread
    public void run(){                      //2.重写run方法
        for(int i = 0; i < 1000; i++){      //3.将要执行的代码写在run方法中
            System.out.println("666");
        }
    }
}
