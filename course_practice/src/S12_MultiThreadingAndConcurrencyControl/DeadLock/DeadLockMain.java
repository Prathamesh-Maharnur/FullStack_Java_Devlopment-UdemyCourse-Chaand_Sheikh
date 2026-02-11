package S12_MultiThreadingAndConcurrencyControl.DeadLock;

public class DeadLockMain{
    public static void main(String[] args) throws InterruptedException{
        String lock1 = "lock1";
        String lock2 = "lock2";

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                synchronized(lock1){
                    System.out.println("Thread1, lock1");
                    synchronized(lock2){
                        System.out.println("Thread1, lock2");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                synchronized(lock2){
                    System.out.println("Thread1, lock2");
                    synchronized(lock1){
                        System.out.println("Thread1, lock1");
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