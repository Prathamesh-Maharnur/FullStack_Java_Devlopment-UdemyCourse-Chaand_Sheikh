package S6_Object_oriented_programming.InheritanceExample;
import S6_Object_oriented_programming.InheritanceExample.animal.*;
import S6_Object_oriented_programming.InheritanceExample.animal.birds.Eagle;
import S6_Object_oriented_programming.InheritanceExample.animal.fish.Eel;
import S6_Object_oriented_programming.InheritanceExample.animal.reptile.Crocodile;

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