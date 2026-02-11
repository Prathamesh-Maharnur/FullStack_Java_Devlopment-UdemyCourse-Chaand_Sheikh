package S6_Object_oriented_programming.InheritanceExampleUsingProtected.animal.reptile;

import S6_Object_oriented_programming.InheritanceExampleUsingProtected.animal.Animal;

public class Reptile extends Animal{
    protected String skin;
    protected boolean backbone;
    protected String eggs;

    public Reptile(){
        height=5;
        weight=200;
        animalType="Reptile";
        bloodType="cold-blooded";
        skin = "dry";
        backbone = true;
        eggs = "hard-shelled";
    }

    @Override
    public String showInfo() {
        return "Reptile{" +
                "skin='" + skin + '\'' +
                ", backbone=" + backbone +
                ", eggs='" + eggs + '\'' +
                "} " + super.showInfo();
    }
}