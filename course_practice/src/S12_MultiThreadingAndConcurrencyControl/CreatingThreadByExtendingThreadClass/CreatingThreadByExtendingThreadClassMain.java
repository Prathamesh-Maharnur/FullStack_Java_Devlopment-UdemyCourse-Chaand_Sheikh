package S12_MultiThreadingAndConcurrencyControl.CreatingThreadByExtendingThreadClass;

import static java.lang.Thread.sleep;

class MyCounter {
    private int threadNo;

    public MyCounter(int threadNo){
        this.threadNo = threadNo;
    }

    public void countMe() throws InterruptedException{
        for(int i = 0; i<10; i++){
            sleep(500);
            System.out.println("Thread no.: "+threadNo+" iteration no.: "+i);
        }
    }
}

class CreatingThreadByExtendingThreadClassMain{
    public static void main(String[] args) throws InterruptedException{
        long startTime,endTime;
        MyCounter counter1 = new MyCounter(1);
        startTime = System.currentTimeMillis();
        counter1.countMe();
        MyCounter counter2 = new MyCounter(2);
        counter2.countMe();
        endTime = System.currentTimeMillis();
        System.out.println("Total time required for processing: "+(endTime - startTime));
    }
}