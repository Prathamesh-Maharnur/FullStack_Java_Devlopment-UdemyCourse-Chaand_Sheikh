package S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.fish;

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