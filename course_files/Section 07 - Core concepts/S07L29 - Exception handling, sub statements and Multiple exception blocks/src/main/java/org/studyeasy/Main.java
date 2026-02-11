package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        int y = 0, x;
        try{
            System.out.println("Before Exception");
            x = (y=10*10)/0;
            System.out.println("After Exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");

        }catch (Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println(y);
        }

    }
}
