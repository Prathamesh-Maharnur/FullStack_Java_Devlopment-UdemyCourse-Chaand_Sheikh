    package org.studyeasy;
 import java.io.*;

public class Main {
    public static void main(String[] args){
        File file = new File("studyeasy//test.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
           String line;
           while ((line = br.readLine()) != null){
               System.out.println(line);
           }

            System.out.println("File operation was successful");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }

    }
}