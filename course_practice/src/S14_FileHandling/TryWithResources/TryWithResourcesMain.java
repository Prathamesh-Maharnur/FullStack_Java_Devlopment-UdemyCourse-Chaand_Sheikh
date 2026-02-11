package S14_FileHandling.TryWithResources;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class TryWithResourcesMain{
    public static void main(String args[]){
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter("src/S14_FileHandling/TryWithResources/demo.txt",true));
            bw.newLine();
            bw.write("Hello, I am Prathamesh Maharnur!!!");
            System.out.println("File Write operation was successful!");
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
        finally{
            try{
                bw.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}