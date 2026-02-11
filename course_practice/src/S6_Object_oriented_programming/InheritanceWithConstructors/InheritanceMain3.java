package S6_Object_oriented_programming.InheritanceWithConstructors;
import S6_Object_oriented_programming.InheritanceWithConstructors.vehicles3.*;


public class InheritanceMain3{
    public static void main(String args[]){

        Vehicle vehicle = new Vehicle();
        System.out.println("Vehicle info: "+vehicle.toString());

        Bike bike  = new Bike("electric", 2, 2, 18, "LED", "Short");
        System.out.println("Bike info: "+bike.toString());
        System.out.println();

        Car car = new Car();
        System.out.println("Car info: "+car.toString());
        System.out.println();

        // only object name without .toString() not written also works
        Truck truck = new Truck();
        System.out.println("Truck info: "+truck);
        System.out.println();

        System.out.println("Before change Truck engine: "+truck.getEngine());
        truck.setEngine("diesel");
        System.out.println("After change Truck engine: ");
        System.out.println(truck.toString());
    }
}