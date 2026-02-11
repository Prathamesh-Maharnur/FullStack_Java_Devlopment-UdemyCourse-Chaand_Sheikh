package S12_MultiThreadingAndConcurrencyControl.JoinMethodInMultiThreadingMain;

class JoinMethodInMultiThreadingMain{
    public static int counter = 0;
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0; i<1000; i++){
                    counter++;
                }
            }
        });
        t1.start();
        t1.join();
        System.out.println("Counter: "+counter);
    }
}