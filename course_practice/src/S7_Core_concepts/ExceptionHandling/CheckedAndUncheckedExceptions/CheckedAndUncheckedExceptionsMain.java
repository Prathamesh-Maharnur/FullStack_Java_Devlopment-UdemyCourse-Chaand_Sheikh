package S7_Core_concepts.ExceptionHandling.CheckedAndUncheckedExceptions;

class CheckedAndUncheckedExceptions{
    public static void main(String args[]){
        CheckedAndUncheckedExceptions main = new CheckedAndUncheckedExceptions();
        main.doSomething();
        /*
         for unchecked exception there is no need to handle it,
         but it needs to be handled for checked exception
           User defined exception IS A checked Exception
        */
    }

    public void doSomething(){
        String s = "zero";
        if(s.equals("zero")){
            throw new RuntimeException();
        }
    }
}