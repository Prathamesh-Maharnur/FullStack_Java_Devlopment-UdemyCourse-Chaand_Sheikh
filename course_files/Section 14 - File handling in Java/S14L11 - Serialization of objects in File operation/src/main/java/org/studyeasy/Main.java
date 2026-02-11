package org.studyeasy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static int x = 50;
    public static void main(String[] args){
        Vehicle bike = new Vehicle("Bike", 52141);
        Vehicle car = new Vehicle("Car", 95824);

        try (FileOutputStream fos = new FileOutputStream("Studyeasy//vehicle.dat")){
            try (ObjectOutputStream obj = new ObjectOutputStream(fos)){
                obj.writeObject(bike);
                obj.writeObject(car);
                System.out.println("File operation was successful");
                System.out.println("x="+x);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}