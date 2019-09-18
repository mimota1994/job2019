package main.job.tongchengyilong;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Main1 {
    private static int state = 0;

    static String str;

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        final ReentrantLock lock = new ReentrantLock();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(state < 3){
                    try{
                        lock.lock();
                        if(state == 0){
                            str += "_A";
                            state ++;
                        }
                    }finally{
                        lock.unlock();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(state < 3){
                    try{
                        lock.lock();
                        if(state == 1){
                            str += "_B";
                            state ++;
                        }
                    }finally{
                        lock.unlock();
                    }
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(state < 3){
                    try{
                        lock.lock();
                        if(state == 2){
                            str += "_C";
                            state ++;
                        }
                    }finally{
                        lock.unlock();
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(str);

    }
}
