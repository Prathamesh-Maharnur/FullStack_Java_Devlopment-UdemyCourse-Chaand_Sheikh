package S12_MultiThreadingAndConcurrencyControl.BlockingQueue;

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
                queue.put(BlockingQueueMain.counter);
                System.out.println("Value added in the queue: "+BlockingQueueMain.counter);
                BlockingQueueMain.counter++;
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class BlockingQueueMain{
    public static int counter = 1;
    public static void main(String[] args){
        ArrayBlockingQueue queue = new ArrayBlockingQueue<>(10);
        Thread t1 = new Thread(new Producers(queue));
        t1.start();
    }
}