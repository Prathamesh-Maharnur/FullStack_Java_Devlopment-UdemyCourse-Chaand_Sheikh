package S12_MultiThreadingAndConcurrencyControl.ThreadPoolInMultiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class SomeThread extends Thread{
    private String name;
    public SomeThread(String name){
        super(name);
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println("Started thread "+name);
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Ended thread "+name);
    }
}

class ThreadPoolInMultiThreadingMain{
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(6);

        SomeThread t1 = new SomeThread("Thread1");
        SomeThread t2 = new SomeThread("Thread2");
        SomeThread t3 = new SomeThread("Thread3");
        SomeThread t4 = new SomeThread("Thread4");
        SomeThread t5 = new SomeThread("Thread5");
        SomeThread t6 = new SomeThread("Thread6");
        SomeThread t7 = new SomeThread("Thread7");
        SomeThread t8 = new SomeThread("Thread8");
        SomeThread t9 = new SomeThread("Thread9");
        SomeThread t10 = new SomeThread("Thread10");
        SomeThread t11 = new SomeThread("Thread11");
        SomeThread t12 = new SomeThread("Thread12");
        SomeThread t13 = new SomeThread("Thread13");

        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);
        executorService.execute(t4);
        executorService.execute(t5);
        executorService.execute(t6);
        executorService.execute(t7);
        executorService.execute(t8);
        executorService.execute(t9);
        executorService.execute(t10);
        executorService.execute(t11);
        executorService.execute(t12);
        executorService.execute(t13);

        executorService.shutdown();
    }
}