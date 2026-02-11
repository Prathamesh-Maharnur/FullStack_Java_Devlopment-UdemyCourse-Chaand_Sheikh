package  S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.birds;

import S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.Animal;

public class Birds extends Animal{
    private boolean feather;
    private boolean canFly;

    public Birds(){
        height=15;
        weight=5;
        animalType="Birds";
        bloodType="warm-blooded";
        feather = true;
        canFly = true;
    }

    @Override
    public String showInfo() {
        return "Birds{" +
                "feather=" + feather +
                ", canFly=" + canFly +
                "} " + super.showInfo();
    }
}
