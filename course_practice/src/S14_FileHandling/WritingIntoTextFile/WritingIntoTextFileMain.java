package S14_FileHandling.WritingIntoTextFile;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class WritingIntoTextFileMain{
    public static void main(String[] args) {
        File file = new File("src/S14_FileHandling/WritingIntoTextFile/text/text.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
            bw.newLine();
            bw.write("Learner: ");
            bw.write("Prathamesh");

            System.out.println("Operation Successful");
        }
        catch(IOException e){
            System.out.println("Something went wrong!!!");
        }
    }
}