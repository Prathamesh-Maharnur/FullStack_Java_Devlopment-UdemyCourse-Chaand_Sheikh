package S6_Object_oriented_programming.InheritanceWithAccessGettersAndSetters.vehicles2;

public class Bike extends Vehicle {
    private String handle;

    public Bike() {
        handle = "Short";
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle){
        this.handle = handle;
    }
}