package S6_Object_oriented_programming.InheritanceExample.animal.fish;
import S6_Object_oriented_programming.InheritanceExample.animal.fish.Fish;

public class Eel extends Fish{
    private boolean electricCharge;

    public Eel(){
        electricCharge = true;
    }

    public boolean isElectricCharge() {
        return electricCharge;
    }

    public void setElectricCharge(boolean electricCharge) {
        this.electricCharge = electricCharge;
    }

    @Override
    public String showInfo() {
        return "Eel{" +
                "electricCharge=" + electricCharge +
                "} " + super.showInfo();
    }
}