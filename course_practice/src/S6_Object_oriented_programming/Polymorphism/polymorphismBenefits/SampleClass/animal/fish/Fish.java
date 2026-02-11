package S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.fish;

import S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.Animal;

public class Fish extends Animal{
    protected String habitat;
    protected boolean gills;

    public Fish(){
        height=5;
        weight=5;
        animalType="Fish";
        bloodType="cold-blooded";
        habitat = "ocean";
        gills = true;
    }

    @Override
    public String showInfo() {
        return "Fish{" +
                "habitat='" + habitat + '\'' +
                ", gills=" + gills +
                "} " + super.showInfo();
    }
}
