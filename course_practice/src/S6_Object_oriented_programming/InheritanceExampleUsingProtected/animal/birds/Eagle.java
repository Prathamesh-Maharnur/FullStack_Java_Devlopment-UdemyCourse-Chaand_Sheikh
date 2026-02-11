package S6_Object_oriented_programming.InheritanceExampleUsingProtected.animal.birds;

public class Eagle extends Birds{
    @Override
    public String showInfo() {
        return "Eagle{} " + super.showInfo();
    }
}