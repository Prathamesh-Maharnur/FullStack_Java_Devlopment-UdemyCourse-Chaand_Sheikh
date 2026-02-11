package S12_MultiThreadingAndConcurrencyControl.WaitAndNotifyInMultiThreading;

class WaitAndNotifyInMultiThreadingMain{
    public static int balance = 0;
    synchronized public void withdraw(int amount) throws InterruptedException{
        if(balance <= 0){
            System.out.println("Waiting for the amount to be updated for withdraw of $ "+amount);
            wait();
        }
        balance -= amount;
        System.out.println("The current balance is $ "+balance);
    }

    public void deposit(int amount) throws InterruptedException{
        synchronized(this) {
            wait(2000);
            System.out.println("We are depositing the amount in the bank of sum $" + amount);
            balance += amount;
            notify();
        }
    }



    public static void main(String[] args){
        WaitAndNotifyInMultiThreadingMain m = new WaitAndNotifyInMultiThreadingMain();

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                try {
                    m.withdraw(500);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.setName("Thread 1");
        t1.start();


        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                try {
                    m.deposit(2000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t2.setName("Thread 2");
        t2.start();
    }
}