package S6_Object_oriented_programming.InheritanceWithConstructors.vehicles3;

public class Bike extends Vehicle {
    private String handle;

    public Bike() {
        handle = "Short";
    }

    //parametrized constructor with Vehicle class values initialized
    public Bike(String engine, int wheels, int seats, int fuelTanks, String lights, String handle){
        super(engine, wheels, seats, fuelTanks, lights);
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                "} " + super.toString();
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle){
        this.handle = handle;
    }
}