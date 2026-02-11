package S14_FileHandling.ReadATextFile;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

class ReadATextFileMain{
    public static void main(String[] args){
        File file = new File("src/S14_FileHandling/ReadATextFile/demo.txt");
        /*
        * BufferedReader br = new BufferedReader(new FileReader(file))
        * can also be used in try-with-resource block just for
        * demonstration FileReader and BufferReader different objects
        *  are created
        */
        try(    FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("File Read operation was successful!");
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Something went wrong!!!");
        }
    }
}