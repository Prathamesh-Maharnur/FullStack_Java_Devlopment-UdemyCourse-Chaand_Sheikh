package org.studyeasy;

import java.util.Random;

import static java.lang.Thread.sleep;

class MyCounter implements Runnable{
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Random random = new Random();
                sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread no: "+threadNo + " and iteration no: "+i);
        }

    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyCounter(1));
        Thread thread2 = new Thread(new MyCounter(2));
        thread1.start();
        thread2.start();

    }
}


