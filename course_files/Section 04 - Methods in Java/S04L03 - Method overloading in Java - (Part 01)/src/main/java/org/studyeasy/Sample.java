package org.studyeasy;

public class Sample {
    public static void main(String[] args) {

        System.out.println("Area of the square "+ area(5, 6));


    }
    public static double area(int height, int width){
         return height*width;
    }

    public static int area(int side){
        return side*side;
    }
    public static double area(double side){
        return side*side;
    }
}
