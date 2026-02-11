package S6_Object_oriented_programming.InheritanceWithConstructors.vehicles3;

public class Vehicle{
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTanks;
    private String lights;

    public Vehicle(){
        engine = "petrol";
        wheels = 2;
        seats = 2;
        fuelTanks = 14;
        lights = "LED";
    }

    public Vehicle(String engine, int wheels, int seats, int fuelTanks, String lights){
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTanks = fuelTanks;
        this.lights = lights;
    }

    public String getEngine(){
        return engine;
    }

    public int getWheels(){
        return wheels;
    }

    public int getSeats(){
        return seats;
    }

    public int getFuelTanks(){
        return fuelTanks;
    }

    public String getLights(){
        return lights;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setFuelTanks(int fuelTanks) {
        this.fuelTanks = fuelTanks;
    }

    public void setLights(String lights) {
        this.lights = lights;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTanks=" + fuelTanks +
                ", lights='" + lights + '\'' +
                '}';
    }
}

