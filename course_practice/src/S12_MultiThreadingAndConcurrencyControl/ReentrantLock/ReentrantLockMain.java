package S12_MultiThreadingAndConcurrencyControl.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockMain{
    static int counter = 0;
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                lock.lock();
                try{
                    for(int i = 1; i <= 1000; i++){
                        ReentrantLockMain.counter++;
                    }
                }
                finally{
                    lock.unlock();
                }
            }
        });


        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                lock.lock();
                try{
                    for(int i = 1; i <= 1000; i++){
                        ReentrantLockMain.counter++;
                    }
                }
                finally{
                    lock.unlock();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Counter: "+counter);
    }
}