package S12_MultiThreadingAndConcurrencyControl.CreatingThreadByExtendingThreadClassContinues;

import java.lang.Thread;
import static java.lang.Thread.sleep;

class MyCounter extends Thread{
    private int threadNo;

    public MyCounter(int threadNo){
        this.threadNo = threadNo;
    }

    @Override
    public void run(){
        try{
            countMe();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void countMe() throws InterruptedException{
        for(int i = 0; i < 10; i++){
            sleep(500);
            System.out.println("Thread no.: "+threadNo+" iteration no.: "+i);
        }
    }
}

class CreatingThreadByExtendingThreadClassContinues{
    public static void main(String[] args) throws InterruptedException{
        long startTime,endTime;
        MyCounter counter1 = new MyCounter(1);
        startTime = System.currentTimeMillis();
        counter1.start();
        System.out.println("**************************************************");
        MyCounter counter2 = new MyCounter(2);
        counter2.start();
        sleep(6000);
        endTime = System.currentTimeMillis();
        System.out.println("Total time for processing: "+(endTime-startTime));
    }
}