package S7_Core_concepts.ExceptionHandling.ExceptionHandlingWithFinallyBlock;

import java.sql.SQLOutput;

class ExceptionHandlingWithFinallyBlock{
    public static void main(String args[]){
        int x, y=0;
        try{
            System.out.println("Before Exception");
            x=(y=10*10)/0;
            System.out.println("After Exception");
        }
        finally{
            System.out.println("It's finally block and it has special power");
        }
    }
}