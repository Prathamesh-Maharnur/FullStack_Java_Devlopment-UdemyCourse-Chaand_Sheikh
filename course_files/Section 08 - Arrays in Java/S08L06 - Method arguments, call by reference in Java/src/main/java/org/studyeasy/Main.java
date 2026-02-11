package org.studyeasy;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Tom", "Chaand", "Study", "Easy", "Raj"};
        //System.out.println(names);
        System.out.println(names[0]);
        Main main = new Main();
        main.displayNames(names);
        System.out.println("New value : "+names[0]);

    }
    void displayNames(String[] names){
        System.out.println(names[0]);
        names[0] = "John";
    }
}