package org.studyeasy;

public class Main {

    public static void main(String[] args) {
        System.out.println(args[1]);

        if (args[0].equals(new Lock().getCode())){
            System.out.println("The door is now open");
        }else{
            System.out.println("The door is closed");
        }


    }
}