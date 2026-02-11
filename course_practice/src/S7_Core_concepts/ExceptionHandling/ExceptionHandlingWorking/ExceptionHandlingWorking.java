package S7_Core_concepts.ExceptionHandling.ExceptionHandlingWorking;

class ExceptionHandlingWorking{
    public static void main(String args[]){
        int x=10,y=0;
        try{
            System.out.println("Before Execution");
            System.out.println("The operation performed is x/y: "+x/y);
            System.out.println("After Execution");
        }
        catch(Exception e){
            System.out.println("Divide by zero exception occurred!");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}