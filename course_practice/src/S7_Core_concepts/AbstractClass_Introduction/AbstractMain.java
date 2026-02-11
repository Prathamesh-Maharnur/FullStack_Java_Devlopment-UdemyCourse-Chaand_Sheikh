package S7_Core_concepts.AbstractClass_Introduction;

import S7_Core_concepts.AbstractClass_Introduction.Person.*;

public class AbstractMain{
    public static void main(String args[]){

        Person p1 = new John();
        p1.speak();
        p1.eat();

        Pooja p2 = new Pooja();
        p2.speak();
        p2.eat();

        // the eat() is ended with semicolon after defining abstract method
        Person p3 = new Person() {
            @Override
            public void eat() {
                System.out.println("Eats food!!!");
            }
        };
        p3.speak();
        p3.eat();
    }
}