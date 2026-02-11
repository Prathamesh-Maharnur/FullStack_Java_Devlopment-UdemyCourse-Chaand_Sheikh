class Prgm1_methods{
    public static void main(String args[]){
        loop(10,20);
        System.out.println("**************************");
        loop(20,30);
        System.out.println("**************************");

        // if condition is given no need to give intialization
        int x=1,y=10;
        for(; x < y; x++){
            System.out.println(x);
        }

    }

    public static void loop(int start, int stop){
        for(; start < stop; start++){
            System.out.println(start);
        }
    }
}