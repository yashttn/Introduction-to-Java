package Multi_Threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ques16 {

    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);

    public void acquireLock(Lock lock1, Lock lock2){

        boolean acquireLock1= lock1.tryLock();
        boolean acquireLock2= lock2.tryLock();

        if(acquireLock1 && acquireLock2){
            return;
        }

        if(acquireLock1){
            lock1.unlock();
        }

        if(acquireLock2){
            lock2.unlock();
        }

    }

    public void worker1(){
        acquireLock(lock1,lock2);
        System.out.println("lock 1 worker 1");
        System.out.println("lock 2 worker 1");

        try {
            lock2.unlock();
            lock1.unlock();
        }catch (Exception e){
            System.out.println("Problem in unlocking lock by worker1!");
        }
    }

    public void worker2(){
        acquireLock(lock2,lock1);
        System.out.println("lock 1 worker 2");
        System.out.println("lock 2 worker 2");
        try {
            lock1.unlock();
            lock2.unlock();
        }catch(Exception e){
            System.out.println("Problem in unlocking lock by worker2!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ques16 demo = new Ques16();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
