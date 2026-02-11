package S14_FileHandling.SerializationOfObjectsInFileOperation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class WriteObjectsMain{
    public static void main(String[] args) {
        File file = new File("src/S14_FileHandling/SerializationOfObjectsInFileOperation/DemoFolder/vehicle.dat");
        Vehicle bike = new Vehicle("Bike",2986);
        Vehicle car = new Vehicle("Car",7371);
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream obj = new ObjectOutputStream(fos)){
            obj.writeObject(bike);
            obj.writeObject(car);
            System.out.println("File operation was successful");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}