package S14_FileHandling.CreateDirectory;

import java.io.File;
import java.io.IOException;

class CreateDirectoryMain{
    public static void main(String[] args) throws IOException {
        File file1 = new File("folder1");
        if(file1.mkdir()) {
            System.out.println("Folder created!!!");
        }
        else{
            System.out.println("Folder already exists");
        }

        File file2 = new File("src/S14_FileHandling/CreateDirectory/folder2/folderA/folderB/folderC");
        if(file2.mkdirs()) {
            System.out.println("Folder created!!!");
        }
        else{
            System.out.println("Folder already exists");
        }

        System.out.println("****************************************************************************************************");
        System.out.println("getPath() method for folder1: "+file1.getPath());
        System.out.println("getAbsolutePath() method for folder1: "+file1.getAbsolutePath());
        System.out.println("getPath() method for folder2: "+file2.getPath());
        System.out.println("getAbsolutePath() method for folder2: "+file2.getAbsolutePath());

        File file3 = new File("src/S14_FileHandling/CreateDirectory/folder2/text1.txt");
        file3.createNewFile();

        File file4 = new File("src/S14_FileHandling/CreateDirectory/folder2/folderA/folderB/folderC/text2.txt");
        file4.createNewFile();

        File file5 = new File("src/S14_FileHandling/CreateDirectory/folder2/folderA/folderB/text3.txt");
        file5.createNewFile();

        File file6 = new File("src/S14_FileHandling/CreateDirectory");
        File[] fileList = file6.listFiles();

        System.out.println("**********************************************************************************");

        if(fileList != null){
            for(File temp: fileList){
                if(temp.isDirectory()){
                    System.out.println("Directory founded: "+temp.getName());
                }
                if(temp.isFile()){
                    System.out.println("File founded: "+temp.getName());
                }
            }
        }


    }
}