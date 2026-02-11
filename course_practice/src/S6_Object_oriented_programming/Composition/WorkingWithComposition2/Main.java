package S6_Object_oriented_programming.Composition.WorkingWithComposition2;

import S6_Object_oriented_programming.Composition.WorkingWithComposition2.laptop.Laptop;
import S6_Object_oriented_programming.Composition.WorkingWithComposition2.laptop.components.*;

public class Main{
    public static void main(String args[]) {
        // there are two types of constructors(default and parameterised)
        // but there can be multiple parameterised constructors formed in various combinations/permutation
        Processor p1 = new Processor();
        GraphicCard g1 = new GraphicCard();
        Laptop l1 = new Laptop(24.0f,p1,"DDR5","1TB",g1,"Single Layer","backlit");
        System.out.println(l1);
    }
}