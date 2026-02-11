package S12_MultiThreadingAndConcurrencyControl.JoinMethodInMultiThreadingContinuesMain;

class JoinMethodInMultiThreadingContinuesMain{
    public static int counter1;
    public static int counter2;
    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=1; i<=1000; i++){
                    try{
                        Thread.sleep(1);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    counter1++;
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=1; i<=1000; i++){
                    try{
                        Thread.sleep(1);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    counter2++;
                }
            }
        });
        t2.start();

        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    t1.join();
                    t2.join();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Counter1: "+counter1);
                System.out.println("Counter2: "+counter2);
            }
        });
        t3.start();

        System.out.println("Main Thread: "+Thread.currentThread().getName());
    }
}