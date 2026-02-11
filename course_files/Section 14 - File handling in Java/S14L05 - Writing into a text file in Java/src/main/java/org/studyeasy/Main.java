package org.studyeasy;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        File file = new File("studyeasy//test.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
            bw.newLine();
            bw.write("Author: ");
            bw.write("Chaand");

            System.out.println("File operation was successful");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }

    }
}