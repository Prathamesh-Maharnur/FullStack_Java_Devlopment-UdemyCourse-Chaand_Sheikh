package S6_Object_oriented_programming.Inheritance;
import S6_Object_oriented_programming.Inheritance.vehicles.Bike;

public class InheritanceMain{
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.engine = "Petrol";
        bike.handle = "Short";
        System.out.println("handle: "+bike.handle+"\n"+"engine: "+bike.engine);
        System.out.println("Fuel tank: "+bike.fuelTanks);
    }
}