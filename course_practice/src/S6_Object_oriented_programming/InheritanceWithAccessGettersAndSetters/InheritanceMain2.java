package S6_Object_oriented_programming.InheritanceWithAccessGettersAndSetters.vehicles2;


public class InheritanceMain2{
    public static void main(String args[]){

        Vehicle vehicle = new Vehicle();
        System.out.println("Vehicle engine: "+vehicle.getEngine());

        Bike bike  = new Bike();
        System.out.println("Bike fuel tank: "+bike.getFuelTanks()+"\t\t\t\tBike engine: "+bike.getEngine());

        Car car = new Car();
        System.out.println("Car music system: "+car.getMusicSystem()+"\t\tCar lights: "+car.getLights());

        Truck truck = new Truck();
        System.out.println("Truck container: "+truck.getContainer()+"\t\t\t\tTruck seats: "+truck.getSeats());

        System.out.println("Before change Truck engine: "+truck.getEngine());
        truck.setEngine("diesel");
        System.out.println("After change Truck engine: "+truck.getEngine());
    }
}