package S6_Object_oriented_programming.InheritanceExample.animal.reptile;
import S6_Object_oriented_programming.InheritanceExample.animal.reptile.Reptile;

public class Crocodile extends Reptile{
    public Crocodile(){
        setEggs("hard-shelled");
    }

    @Override
    public String showInfo() {
        return "Crocodile{} " + super.showInfo();
    }
}
