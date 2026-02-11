package S6_Object_oriented_programming.InheritanceExample.animal.birds;
import S6_Object_oriented_programming.InheritanceExample.animal.birds.Birds;

public class Eagle extends Birds{
    @Override
    public String showInfo() {
        return "Eagle{} " + super.showInfo();
    }
}