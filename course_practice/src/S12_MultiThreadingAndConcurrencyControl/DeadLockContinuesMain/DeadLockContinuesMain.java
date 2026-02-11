package S12_MultiThreadingAndConcurrencyControl.DeadLockContinuesMain;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadLockContinuesMain{
    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException{

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                boolean flagLock1 = false;
                boolean flagLock2 = false;
                while(true){
                    try{
                        flagLock1 = lock1.tryLock(10,TimeUnit.MILLISECONDS);
                        flagLock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }

                    if(flagLock1){
                        System.out.println("Thread1, lock1");
                        lock1.unlock();
                    }
                    if(flagLock2){
                        System.out.println("Thread1, lock2");
                        lock2.unlock();
                    }
                    if(flagLock1 && flagLock2){
                        System.out.println("Both Locks Aquired for Thread 1");
                        break;
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                boolean flagLock1 = false;
                boolean flagLock2 = false;
                while(true){
                    try{
                        flagLock1 = lock1.tryLock(10,TimeUnit.MILLISECONDS);
                        flagLock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }

                    if(flagLock2){
                        System.out.println("Thread2, lock2");
                        lock2.unlock();
                    }
                    if(flagLock1){
                        System.out.println("Thread2, lock1");
                        lock1.unlock();
                    }
                    if(flagLock1 && flagLock2){
                        System.out.println("Both Locks Aquired for Thread 2");
                        break;
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Main Thread");
    }
}