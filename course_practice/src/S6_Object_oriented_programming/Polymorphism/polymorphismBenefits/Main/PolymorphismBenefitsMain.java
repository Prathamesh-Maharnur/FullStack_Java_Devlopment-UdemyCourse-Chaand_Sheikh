package S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.Main;

import java.util.ArrayList;
import java.util.List;

import S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.Animal;
import S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.birds.Eagle;
import S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.reptile.Reptile;
import S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.birds.Birds;


public class PolymorphismBenefitsMain{
    public static void main(String args[]){
        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal();
        Reptile reptile = new Reptile();
        Animal croc = new Animal();
        Animal eel = new Animal();
        Birds eagle = new Eagle();

        animals.add(animal);
        animals.add(reptile);
        animals.add(croc);
        animals.add(eel);
        animals.add(eagle);
        listAnimals(animals);
    }

    public static void listAnimals(List<Animal> animals){
        System.out.println("Polymorphism used by initializing parent obj with child classes:\n");
        for(Animal animal: animals){
            System.out.println(animal.showInfo());
        }
    }
}