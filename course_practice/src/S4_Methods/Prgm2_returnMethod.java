class Prgm2_returnMethod{
    public static void main(String args[]){

        int area = areaOfRectangle(10,20); // variable initialized with function call
        System.out.println("Area of shape: "+area);
        System.out.println("**************************");
        System.out.println("Area of shape: "+areaOfRectangle(24,44));  //function call in println
    }

    public static int areaOfRectangle(int height, int length){
        return height*length;
    }
}