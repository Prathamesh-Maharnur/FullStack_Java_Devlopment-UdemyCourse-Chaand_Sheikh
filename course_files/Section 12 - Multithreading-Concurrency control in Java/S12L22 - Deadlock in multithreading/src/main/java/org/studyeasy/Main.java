package org.studyeasy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String lock1 = "Lock1";
        String lock2 = "Lock2";
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread1, lock1");
                    synchronized (lock2){
                        System.out.println("Thread1, lock2");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread2, lock2");
                    synchronized (lock1){
                        System.out.println("Thread2, lock1");
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Main Thread");

    }
}
