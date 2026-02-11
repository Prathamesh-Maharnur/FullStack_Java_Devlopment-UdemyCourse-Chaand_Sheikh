package org.studyeasy;

public class Sample {
    public static void main(String[] args) {

        int area = areaOfRectangle(10,15);
        System.out.println("Area of the shape :"+ area);


    }
    public static int areaOfRectangle(int height, int width){

         return height*width;
    }
}
