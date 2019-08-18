package cn.ttw.thread;

public class Ticket2 {
    public static void main(String[] args) {


    }
}

class MyTicket implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            synchronized (Ticket.class){
                if(ticket <= 0){
                    break;
                }
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "---ÕâÊÇµÚ" + ticket-- + "ºÅÆ±");
            }
        }
    }
}
