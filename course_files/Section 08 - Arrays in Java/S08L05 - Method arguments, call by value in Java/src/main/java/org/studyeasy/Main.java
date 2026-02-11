package org.studyeasy;

public class Main {

    public static void main(String[] args) {
        int value = 10;
        Main main = new Main();
        System.out.println("main method : "+value);
        main.displayValue(value);
        System.out.println("main method : "+value);

    }
    void displayValue(int value){

        System.out.println("Display method : "+value);
        value = 20;
        System.out.println("Display method : "+value);

    }
}