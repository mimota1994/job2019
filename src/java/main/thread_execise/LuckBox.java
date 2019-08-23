package main.thread_execise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * 两个抽奖箱
 * 抽一个序列的奖金
 * 每个奖金只能被抽到一次
 */
public class LuckBox {

    public static void main(String[] args) {

        Box b = new Box();
        Thread t1 = new Thread(b,"抽奖箱1");
        Thread t2 = new Thread(b,"抽奖箱2");
        t1.start();
        t2.start();
    }
}

class Box implements Runnable {
    int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
    Random random = new Random();
    List<Integer> list = new ArrayList<>();

    @Override
    public void run() {
        while(true){
            synchronized (this){
                int n = random.nextInt(11);
                if(!list.contains(n)){
                    list.add(n);
                    System.out.println(Thread.currentThread().getName() + " " + arr[n]);
                }else{
                    if(list.size() == 11){
                        break;
                    }
                }
            }
        }

    }
}
