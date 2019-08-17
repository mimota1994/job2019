package main.some;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者消费者模型
 * 1.sychronized实现
 * 2.lock实现，外加condition，可以更好的唤醒线程
 */
public class PubSub {

    static Random random = new Random();

    static LinkedList queue = new LinkedList();

    static int MAX_VALUE = 10;

    static Lock lock = new ReentrantLock();

    static Condition full = lock.newCondition();
    static Condition empty = lock.newCondition();

    public static void produce() throws InterruptedException {
        synchronized (queue){
            while(queue.size() >= MAX_VALUE){
                queue.wait();
            }
            queue.add(random.nextInt());
            queue.notifyAll();
        }
    }

    public static void consume() throws InterruptedException {
        synchronized (queue){
            while(queue.size() == 0){
                queue.wait();
            }
            queue.pop();
            queue.notifyAll();
        }
    }


    public static void produce2(){
        try{
            lock.lock();
            while(queue.size() >= MAX_VALUE){
                try {
                    full.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.add(random.nextInt());
            empty.signalAll();
        }finally {
            lock.unlock();
        }

    }

    public static void consume2(){
        try {
            lock.lock();
            while(queue.isEmpty()){
                try {
                    empty.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.pop();
            full.signalAll();
        }finally {
            lock.unlock();
        }

    }

}
