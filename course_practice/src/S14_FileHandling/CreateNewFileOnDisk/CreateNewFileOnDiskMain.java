package S14_FileHandling.CreateNewFileOnDisk;

import java.io.File;
import java.io.IOException;

class CreateNewFileOnDiskMain{
    public static void main(String[] args)throws IOException{
        File file = new File("/home/prathamesh/Documents/programs_learning/Java/Udemy_Chaand/course_practice/src/S14_FileHandling/CreateNewFileOnDisk/demo1.txt");
        file.createNewFile();
        System.out.println("File1 Created");

        File file2 = new File("/home/prathamesh/Documents/programs_learning/Java/Udemy_Chaand/course_practice/src/S14_FileHandling/CreateNewFileOnDisk/demo2.txt");
        file2.createNewFile();
        System.out.println("File2 Created");

        File file3 = new File("/home/prathamesh/Documents/programs_learning/Java/Udemy_Chaand/course_practice/src/S14_FileHandling/CreateNewFileOnDisk/Demo2.txt");
        file3.createNewFile();
        System.out.println("File3 Created");

        System.out.println("File1 exists: "+file.exists());
        System.out.println("File2 length: "+file2.length());
        System.out.println("File3 path: "+file3.getAbsolutePath());
    }
}