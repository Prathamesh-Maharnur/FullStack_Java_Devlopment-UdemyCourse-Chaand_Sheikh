package S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass;

import S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.Animal;
import S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.birds.Eagle;
import S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.fish.Eel;
import S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.reptile.Crocodile;

public class InheritanceExampleMain{
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.showInfo());

        Crocodile crocodile = new Crocodile();
        System.out.println(crocodile.showInfo());

        Eel eel = new Eel();
        System.out.println(eel.showInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());
    }
}