package main.thread_execise;


import java.util.Random;

/**
 *五个售票点
 * 卖100张票
 */
public class Ticket {

    public static void main(String[] args) {
        TicketRun t = new TicketRun();
        Thread t1 = new Thread(t, "win1");
        Thread t2 = new Thread(t, "win2");
        Thread t3 = new Thread(t, "win3");
        Thread t4 = new Thread(t, "win4");
        Thread t5 = new Thread(t, "win5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class TicketRun implements Runnable{

    int[] ticketArray = new int[100];
    Random random = new Random();
    int index = 0;

    @Override
    public void run() {
        while(true){
            synchronized (this){
                int n = random.nextInt(100);
                if(ticketArray[n] == 0){
                    ticketArray[n] = 1;
                    index ++;
                    System.out.println(Thread.currentThread().getName() + " " + n);
                }else{
                    if(index >= 100){
                        break;
                    }
                }
            }
        }
    }
}
