package org.studyeasy;
import java.io.*;
public class Main {
    public static void main(String[] args){
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter("studyeasy//test.txt", true));
            bw.newLine();
            bw.write("Author: ");
            bw.write("Chaand");

            System.out.println("File write operation was successful");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}