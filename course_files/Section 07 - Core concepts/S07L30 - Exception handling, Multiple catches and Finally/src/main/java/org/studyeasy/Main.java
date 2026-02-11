package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        int y = 0, x;
        try{
            System.out.println("Before Exception");
            x = (y=10*10)/5;
            System.out.println("After Exception");
        }finally {
            System.out.println("It's finally block, and it's has special power");
        }

    }
}
