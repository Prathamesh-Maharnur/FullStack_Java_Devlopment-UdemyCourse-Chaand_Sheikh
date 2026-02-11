package S12_MultiThreadingAndConcurrencyControl.SynchronizationUnderConcurrencyControl;

class SynchronizationUnderConcurrencyControlMain{
    private static int counter=0;
    public static void main(String[] args) throws InterruptedException{
        new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i < 10000; i++){
                    SynchronizationUnderConcurrencyControlMain.counter++;
                }
                System.out.println("The loop in thread 1 is over");
            }
        }).start();

        new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i < 10000; i++){
                    SynchronizationUnderConcurrencyControlMain.counter++;
                }
                System.out.println("The loop in thread 2 is over");
            }
        }).start();

        Thread.sleep(500);
        System.out.println(counter);
    }
}