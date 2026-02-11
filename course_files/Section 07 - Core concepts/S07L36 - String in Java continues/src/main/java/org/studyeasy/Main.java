package org.studyeasy;
public class Main {
    public static void main(String[] args) {
        String a = "study";
        String b = "easy";
        String c = a.concat(b);
        c = c.replace("easy", "hard");
        System.out.println(c);
        if (c.equals("studyhard")){
            System.out.println("Great");
        }else {
            System.out.println("What just happened");
        }


    }


}