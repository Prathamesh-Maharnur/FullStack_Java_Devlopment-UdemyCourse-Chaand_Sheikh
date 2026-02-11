package org.studyeasy;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.doSomething();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void doSomething() throws FileNotFoundException {
        FileReader in = new FileReader("text.txt");
        System.out.println("Do something!");
    }
}
