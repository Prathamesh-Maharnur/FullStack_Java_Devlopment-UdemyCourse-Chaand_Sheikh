package org.studyeasy;

import java.io.File;

public class Main {
    public static void main(String[] args){
        File file = new File("studyeasy//test.txt");
        if(file.delete()){
            System.out.println("File deleted");
        }else{
            System.out.println("File deletion has some error");
        }

    }
}