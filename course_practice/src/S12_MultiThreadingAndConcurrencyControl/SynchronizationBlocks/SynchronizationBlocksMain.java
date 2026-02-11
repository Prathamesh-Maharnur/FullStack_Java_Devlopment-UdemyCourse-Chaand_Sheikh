package S12_MultiThreadingAndConcurrencyControl.SynchronizationBlocks;

class Brackets{
  public void generate() throws InterruptedException{
      synchronized(this){
          for(int i = 1; i<=20; i++){
              Thread.sleep(5);
              if(i <= 10){
                  System.out.print("[");
              }
              else{
                  System.out.print("]");
              }
          }
          System.out.println();

          for(int i = 1; i<=3; i++){
              Thread.sleep(10);
          }
      }
  }
}

// 4100 mini seconds (Sync method)
// 3000 mini seconds (Sync block)

class SynchronizationBlocksMain{
    public static void main(String[] args) throws InterruptedException{
        Brackets brackets = new Brackets();
        new Thread(new Runnable(){
            @Override
            public void run(){
                long startTime = System.currentTimeMillis();
                for(int i = 1; i<=5; i++){
                    try {
                        brackets.generate();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Total time required by thread 01: "+ (endTime - startTime));
            }
        }).start();

        new Thread(new Runnable(){
            @Override
            public void run(){
                long startTime = System.currentTimeMillis();
                for(int i = 1; i<=5; i++){
                    try {
                        brackets.generate();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Total time required by thread 02: "+ (endTime - startTime));
            }
        }).start();

    }
}