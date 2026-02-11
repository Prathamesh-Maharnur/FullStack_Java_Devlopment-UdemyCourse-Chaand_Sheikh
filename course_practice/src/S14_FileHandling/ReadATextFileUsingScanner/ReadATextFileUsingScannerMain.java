package S14_FileHandling.ReadATextFileUsingScanner;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class ReadATextFileUsingScannerMain{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(new File("src/S14_FileHandling/ReadATextFileUsingScanner/demo.txt"))){
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}