package S12_MultiThreadingAndConcurrencyControl.CountDownLatch;

import java.util.concurrent.CountDownLatch;

class SomeThread extends Thread{
    private CountDownLatch latch;

    public SomeThread(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run(){
        System.out.println("Started Thread: "+Thread.currentThread().getName());
        System.out.println("Ended Thread: "+Thread.currentThread().getName());
        latch.countDown();
    }
}

class CountDownLatchMain{
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);

        SomeThread t1 = new SomeThread(latch);
        SomeThread t2 = new SomeThread(latch);
        SomeThread t3 = new SomeThread(latch);
        SomeThread t4 = new SomeThread(latch);
        SomeThread t5 = new SomeThread(latch);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
//        t5.start();

        latch.await();
        System.out.println("Main Thread: "+Thread.currentThread().getName());
    }
}