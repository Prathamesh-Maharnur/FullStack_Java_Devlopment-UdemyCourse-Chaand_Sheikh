package S6_Object_oriented_programming.InheritanceWithAccessGettersAndSetters.vehicles2;

public class Car extends Vehicle{
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private String fridge;
    private String entertainmentSystem;

    public Car() {
        steering = "medium";
        musicSystem = "present";
        airConditioner = "present";
        fridge = "Present";
        entertainmentSystem = "present";
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

    public String getFridge() {
        return fridge;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
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

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public void setEntertainmentSystem(String entertainmentSystem) {
        this.entertainmentSystem = entertainmentSystem;
    }
}