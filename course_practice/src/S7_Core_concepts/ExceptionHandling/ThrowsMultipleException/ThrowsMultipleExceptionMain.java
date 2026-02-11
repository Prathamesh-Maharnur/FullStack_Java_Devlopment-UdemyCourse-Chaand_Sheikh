package S7_Core_concepts.ExceptionHandling.ThrowsMultipleException;

class ThrowsMultipleExceptionMain{
    public static void main(String args[]){
        ThrowsMultipleExceptionMain main = new ThrowsMultipleExceptionMain();
        main.doSomething();
    }

    public void doSomething() throws RuntimeException, ArithmeticException{
        String s = "one";
        if(s.equals("zero")){
            throw new RuntimeException();
        }
        else if(s.equals("one")){
            throw new ArithmeticException();
        }
    }
}