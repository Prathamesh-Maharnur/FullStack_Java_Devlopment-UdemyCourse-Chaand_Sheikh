class Prgm3_methodOverloading1{
    public static void main(String args[]){
        System.out.println("Area of shape = "+area(5.0));
    }

    public static int area(int length, int width){
        return length*width;
    }

    // not possible
//    public static double area(int length, int width){
//        return length*width;
//    }

    public static int area(int side){
        return side*side;
    }

    public static double area(double side){
        return side*side;
    }
}