package org.studyeasy;

import java.io.File;

public class Main {
    public static void main(String[] args){
        File file = new File("c:\\folder\\subfolder\\yetanotherfolder");
        if (file.mkdirs()) {
            System.out.println("Folder created");
        }else {
            System.out.println("Folder already exists");
        }

    }
}
