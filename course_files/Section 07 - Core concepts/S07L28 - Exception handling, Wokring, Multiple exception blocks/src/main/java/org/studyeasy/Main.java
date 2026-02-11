package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Before Exception");
            System.out.println("The divide by 0 exception"+10/0);
            System.out.println("After Exception");
        }catch (Exception e){
            System.out.println("Divide by 0 exception");
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
