package S14_FileHandling.FileDeletion;

import java.io.File;

class FileDeletionMain{
    public static void main(String[] args){
        File file = new File("src/S14_FileHandling/FileDeletion/DemoFolder/Demo.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully!!!");
        }else{
            System.out.println("File deletion has some error!");
        }
    }
}