package S6_Object_oriented_programming.InheritanceExampleUsingProtected.animal.reptile;

public class Crocodile extends Reptile{
    public Crocodile(){
        eggs="hard-shelled";
    }

    @Override
    public String showInfo() {
        return "Crocodile{} " + super.showInfo();
    }
}
