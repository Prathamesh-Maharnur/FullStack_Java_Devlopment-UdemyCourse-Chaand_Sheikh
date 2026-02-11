package S6_Object_oriented_programming.InheritanceWithMethodConflict;
import S6_Object_oriented_programming.InheritanceWithMethodConflict.vehicles4.*;

public class InheritanceMain4 {
    public static void main(String args[]){

        Vehicle vehicle = new Vehicle();
        System.out.println("Vehicle: "+vehicle.run()+"\n");

        Bike bike  = new Bike();
        System.out.println("Bike: "+bike.run());
        System.out.println("Since the run method is defined in both child class and parent class it will "+
                "go for child class 'Bike' method \n");

        Car car = new Car();
        System.out.println("Car info: "+car.run());
        System.out.println("Since the run method id not defined hence it goes to parent class 'Vehicle' \n");

        Truck truck = new Truck();
        System.out.println("Truck info: "+truck.run());
        System.out.println("Same as Bike class");
        System.out.println();
    }
}