package org.studyeasy;


public class Main {
    public static int balance = 0;
    public void withdraw(int amount) throws InterruptedException {
        if(balance <=0 ){
            System.out.println("Waiting for amount to be updated");
            wait();
        }
        balance = balance + amount;
        System.out.println("The current balance is "+ balance);
    }
    public void deposit(int amount){
        System.out.println("We are depositing the amount in the bank");
        balance = balance + amount;
    }
    public static void main(String[] args){
        Main main = new Main();



        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    main.withdraw(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.setName("Thread 1");
        thread1.start();






        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.deposit(2000);
            }
        });
        thread2.setName("Thread 2");
        thread2.start();

    }
}


