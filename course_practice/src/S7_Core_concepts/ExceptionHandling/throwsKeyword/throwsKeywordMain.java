package S7_Core_concepts.ExceptionHandling.throwsKeyword;

import java.io.FileNotFoundException;
import java.io.FileReader;

class throwsKeyword{
    public static void main(String[] args) {
        throwsKeyword main = new throwsKeyword();
        try{
            main.doSomething();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void doSomething() throws FileNotFoundException{
        FileReader file = new FileReader("demo.txt");
        System.out.println("Do Something!!!");
    }
}