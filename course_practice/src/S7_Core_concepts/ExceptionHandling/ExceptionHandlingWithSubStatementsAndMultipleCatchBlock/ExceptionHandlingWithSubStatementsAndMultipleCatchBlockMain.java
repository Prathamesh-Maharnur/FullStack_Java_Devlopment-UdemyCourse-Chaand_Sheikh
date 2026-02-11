package S7_Core_concepts.ExceptionHandling.ExceptionHandlingWithSubStatementsAndMultipleCatchBlock;

class ExceptionHandlingWithSubStatementsAndMultipleCatchBlockMain {
    public static void main(String args[]){
        int x = 1,y=0;
        try{
            System.out.println("Before Exception");
            x = (y=10*10)/0; // y is assigned 100 because it is a sub-statement
            /*
             System.out.println("The divide by zero "+ x/y);
                 the text "The divide by zero" will not be printed
                 because it is part of complete statement
             */
            System.out.println("After Exception");
        }
        catch(ArithmeticException e){
            System.out.println("Number divided by zero");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("y = "+y);
        }
    }
}