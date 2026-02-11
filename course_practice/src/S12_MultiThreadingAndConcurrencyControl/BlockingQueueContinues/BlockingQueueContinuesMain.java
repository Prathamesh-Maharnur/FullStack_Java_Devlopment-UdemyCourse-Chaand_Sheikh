package S12_MultiThreadingAndConcurrencyControl.BlockingQueueContinues;

import java.util.concurrent.ArrayBlockingQueue;

class Producers implements Runnable{
    ArrayBlockingQueue<Integer> queue;

    public Producers(ArrayBlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                queue.put(BlockingQueueContinuesMain.counter);
                System.out.println("Value added in the queue: "+BlockingQueueContinuesMain.counter);
                BlockingQueueContinuesMain.counter++;
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Consumers implements Runnable{
    ArrayBlockingQueue<Integer> queue;

    public Consumers(ArrayBlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1500);
                queue.take();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Value removed from queue: "+BlockingQueueContinuesMain.counter);
            BlockingQueueContinuesMain.counter--;
        }
    }
}


class BlockingQueueContinuesMain{
    public static int counter = 1;
    public static void main(String[] args){
        ArrayBlockingQueue queue = new ArrayBlockingQueue<>(10);
        Thread t1 = new Thread(new Producers(queue));
        t1.start();

        Thread t2 = new Thread(new Consumers(queue));
        t2.start();
    }
}