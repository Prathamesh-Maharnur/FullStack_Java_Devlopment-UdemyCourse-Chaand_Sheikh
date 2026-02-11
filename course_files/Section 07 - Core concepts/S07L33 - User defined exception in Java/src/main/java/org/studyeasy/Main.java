package org.studyeasy;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.doSomething();
    }

    public void doSomething() {
        String x = "zero";
        if (x.equals("zero")){
            throw new RuntimeException();
        }
        System.out.println("Do something!");
    }
}
