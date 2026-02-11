package S14_FileHandling.SerializationOfObjectsInFileOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

class ReadObjectsMain{
    public static void main(String[] args) {
        File file = new File("src/S14_FileHandling/SerializationOfObjectsInFileOperation/DemoFolder/vehicle.dat");
        try(FileInputStream fis = new FileInputStream(file)) {
            try{
                ObjectInputStream obj = new ObjectInputStream(fis);
                Vehicle v1 = (Vehicle) obj.readObject();
                Vehicle v2 = (Vehicle) obj.readObject();

                System.out.println(v1);
                System.out.println(v2);
            }
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}