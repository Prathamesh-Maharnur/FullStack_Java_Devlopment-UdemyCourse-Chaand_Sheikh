package S12_MultiThreadingAndConcurrencyControl.InterruptMethod;

class InterruptMethodMain{
    public static int balance = 0;
    synchronized public void withdraw(int amount) throws InterruptedException{
        if(balance <= 0){
            System.out.println("Waiting for amount to be updated after withdrawal of $"+amount);
            try {
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Withdrawl interrupted");
            }

            if(balance < amount){
                System.out.println("Your balance too low for withdrawl $"+amount);
                System.out.println("Withdrawl icomplete");
                return;
            }
        }
        balance -= amount;
        System.out.println("The current balance is $"+ balance);
    }

    public boolean deposit(int amount){
        synchronized(this) {
            if(amount > 0) {
                System.out.println("We are depositing the amount in the bank of sum $" + amount);
                balance += amount;
                notify();
                return true;
            }
            else{
                System.out.println("Invalid Amount");
                return false;
            }
        }
    }
    public static void main(String[] args){
        InterruptMethodMain main = new InterruptMethodMain();

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.withdraw(1000);
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
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                if(main.deposit(100)){
                    System.out.println("Deposit complete");
                }
                else{
                    t1.interrupt();
                }
            }
        });
        t2.setName("Thread 2");
        t2.start();
    }
}