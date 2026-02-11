package S7_Core_concepts.ExceptionHandling.ExceptionHandlingIntroduction;

class ExceptionHandlingMain{
    public static void main(String args[]){
        ExceptionHandlingMain m = new ExceptionHandlingMain();
        m.case1(10, 0);
        m.case2(10, 0);
        }

    public void case1(int x, int y){
        if(y != 0){
            System.out.println("x/y = "+x/y);
        }
        else{
            System.out.println("The value of y is 0, a possible exception");
        }
    }

    public void case2(int x, int y){
        try{
            System.out.println(x/y);
        }
        catch(Exception e){
            System.out.println("The value of y is 0");
        }
    }
}