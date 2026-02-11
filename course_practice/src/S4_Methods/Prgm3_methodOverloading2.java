class Prgm3_methodOverloading2{
    public static void main(String args[]){
        sum(5,10);
        sum(5.0,10);
        sum(4.5f,6.5f);
        sum(3,7.8);
    }

    public static void sum(int x, int y){
        System.out.println("Addition of 2 int's");
    }

    public static void sum(double x, int y){
        System.out.println("Addition of 1 int and 1 double");
    }

    public static void sum(float x, float y){
        System.out.println("Addition of 2 float's");
    }

    // different method than 2nd because parameter sequence is different
    public static void sum(int y, double x){
        System.out.println("Addition of 1 double and 1 int");
    }
}