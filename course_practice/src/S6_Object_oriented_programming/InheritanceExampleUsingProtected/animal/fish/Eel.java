package S6_Object_oriented_programming.InheritanceExampleUsingProtected.animal.fish;

public class Eel extends Fish{
    protected boolean electricCharge;

    public Eel(){
        electricCharge = true;
    }

    @Override
    public String showInfo() {
        return "Eel{" +
                "electricCharge=" + electricCharge +
                "} " + super.showInfo();
    }
}