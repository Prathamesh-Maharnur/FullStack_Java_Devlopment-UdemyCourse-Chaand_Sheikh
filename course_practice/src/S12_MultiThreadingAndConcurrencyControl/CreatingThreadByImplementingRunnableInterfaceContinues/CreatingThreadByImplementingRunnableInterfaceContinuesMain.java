package S12_MultiThreadingAndConcurrencyControl.CreatingThreadByImplementingRunnableInterfaceContinues;

// sleep() belongs to (already imported) lang package and can be direct called using Thread.sleep(5000)
import static java.lang.Thread.sleep;
import java.util.Random;

class CreatingThreadByImplementingRunnableInterfaceContinuesMain{
    public static void main(String[] args){
        new Thread(new Runnable(){
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
                    System.out.println(i);
                }
            }
        }).start();
    }
}