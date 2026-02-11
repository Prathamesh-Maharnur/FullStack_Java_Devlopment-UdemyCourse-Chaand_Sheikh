package S12_MultiThreadingAndConcurrencyControl.CreatingThreadByImplementingRunnableInterface;

import java.util.Random;
import static java.lang.Thread.sleep;

class MyCounter implements Runnable{
    private int threadNo;

    public MyCounter(int threadNo){
        this.threadNo = threadNo;
    }

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            try{
                Random random = new Random();
                sleep(random.nextInt(1000));
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thread no.: "+threadNo+" iteration no.: "+i);
         }
    }
}

class CreatingThreadByImplementingRunnableInterface{
    public static void main(String[] args) throws InterruptedException{
        long startTime,endTime;
        Thread thread1 = new Thread(new MyCounter(1));
        startTime = System.currentTimeMillis();
        thread1.start();
        Thread thread2 = new Thread(new MyCounter(2));
        thread2.start();
        endTime = System.currentTimeMillis();
    }
}