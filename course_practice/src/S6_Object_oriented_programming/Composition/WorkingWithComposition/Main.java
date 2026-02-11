package S6_Object_oriented_programming.Composition.WorkingWithComposition;

import S6_Object_oriented_programming.Composition.WorkingWithComposition.laptop.Laptop;

public class Main{
    public static void main(String args[]) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.getProcessor().getBrand());
    }
}