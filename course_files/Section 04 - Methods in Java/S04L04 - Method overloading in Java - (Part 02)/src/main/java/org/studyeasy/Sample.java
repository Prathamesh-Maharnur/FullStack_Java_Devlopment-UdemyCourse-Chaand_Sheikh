package org.studyeasy;

public class Sample {
    public static void main(String[] args) {
        sum(1,2);
        sum(2.1f,2.2f);
        sum(1.2, 20);
        sum(1,2.0);


    }
    public static void sum(int x, int y){
        System.out.println("Addition of 2 int's");
    }
    public static void sum(float x, float y){
        System.out.println("Addition of 2 floats");
    }
    public static void sum(double x, int y){
        System.out.println("Addition of 1 double and 1 int");
    }
    public static void sum(int x, double y){
        System.out.println("Addition of 1 int and 1 double");
    }
}
