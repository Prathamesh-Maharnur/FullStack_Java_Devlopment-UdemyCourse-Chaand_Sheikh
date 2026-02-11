package S12_MultiThreadingAndConcurrencyControl.SynchronizationBlocksBasedOnObjects;

class Brackets{
    private Object lock = "lock";

    public void generate() throws InterruptedException{
        synchronized(lock){
           for(int i = 1; i <= 20; i++){
               Thread.sleep(5);
               if (i <= 10) {
                   System.out.print('[');
               }
               else{
                   System.out.print(']');
               }
           }
            System.out.println();
        }
    }
}

class SynchronizationBlocksBasedOnObjectsMain{
    public static void main(String[] args) throws InterruptedException{
        Brackets brackets = new Brackets();

        new Thread(new Runnable(){
            @Override
            public void run(){
                long startTime = System.currentTimeMillis();
                for(int i = 0; i<5; i++){
                    try {
                        brackets.generate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Total time required by thread 1:"+(endTime-startTime));
            }
        }).start();

        new Thread(new Runnable(){
            @Override
            public void run(){
                long startTime = System.currentTimeMillis();
                for(int i = 0; i<5; i++){
                    try {
                        brackets.generate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Total time required by thread 2:"+(endTime-startTime));
            }
        }).start();


    }
}