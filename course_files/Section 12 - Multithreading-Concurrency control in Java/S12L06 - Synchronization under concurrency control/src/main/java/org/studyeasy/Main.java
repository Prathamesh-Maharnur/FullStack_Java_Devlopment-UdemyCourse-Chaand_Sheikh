package org.studyeasy;


public class Main {
    public static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100000; i++) {
                    Main.counter++;
                }
                System.out.println("The loop in thread 1 is over");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100000; i++) {
                    Main.counter++;
                }
                System.out.println("The loop in thread 2 is over");
            }
        }).start();
        Thread.sleep(200);
        System.out.println(counter);

    }
}


