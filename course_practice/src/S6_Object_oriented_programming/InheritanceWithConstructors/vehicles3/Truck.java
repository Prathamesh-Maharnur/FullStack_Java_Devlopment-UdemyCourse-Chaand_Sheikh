package S6_Object_oriented_programming.InheritanceWithConstructors.vehicles3;

public class Truck extends Vehicle{
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private int container;

    public Truck() {
        steering = "present";
        musicSystem = "present";
        airConditioner = "absent";
        container = 1;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public int getContainer() {
        return container;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public void setMusicSystem(String musicSystem) {
        this.musicSystem = musicSystem;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void setContainer(int container) {
        this.container = container;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", container=" + container +
                "} " + super.toString();
    }
}