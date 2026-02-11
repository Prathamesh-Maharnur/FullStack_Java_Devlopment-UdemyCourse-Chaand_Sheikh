package org.studyeasy;


public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Statement 01");
            System.out.println("Statement 02");
        });
        thread.start();

    }
}
