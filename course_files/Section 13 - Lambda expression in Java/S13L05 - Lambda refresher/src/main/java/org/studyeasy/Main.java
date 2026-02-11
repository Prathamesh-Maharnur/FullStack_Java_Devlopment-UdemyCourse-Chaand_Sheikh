package org.studyeasy;

interface Data{
    public int demo(int x, float y);
}

public class Main {
    public static void main(String[] args) {
        Data data = (x, y)-> {
            System.out.println("Value of y is "+y);
            System.out.println("The value of x will be returned by the method");
            return x;
        };
        System.out.println(data.demo(10, 25.00F));

    }
}
