package  S6_Object_oriented_programming.InheritanceExample.animal.birds;
import S6_Object_oriented_programming.InheritanceExample.animal.Animal;

public class Birds extends Animal{
    private boolean feather;
    private boolean canFly;

    public Birds(){
        setHeight(15);
        setWeight(5);
        setAnimalType("Birds");
        setBloodType("warm-blooded");
        feather = true;
        canFly = true;
    }

    public boolean isFeather() {
        return feather;
    }

    public void setFeather(boolean feather) {
        this.feather = feather;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String showInfo() {
        return "Birds{" +
                "feather=" + feather +
                ", canFly=" + canFly +
                "} " + super.showInfo();
    }
}
