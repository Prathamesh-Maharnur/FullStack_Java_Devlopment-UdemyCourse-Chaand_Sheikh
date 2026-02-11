package S7_Core_concepts.StaticInnerClass;

public class StaticInnerMain{
    public static void main(String args[]){
        System.out.println( "Static Method Call: "+Outer.Inner.getX());

        Outer.Inner obj = new Outer.Inner();
        System.out.println("\nStatic Class NonStatic Method Call: ");
        obj.StaticClass_NonStaticMethod();

        System.out.println("\nInner Static Method Call: ");
        Outer.InnerNonStatic out = new Outer().new InnerNonStatic();
        out.display();
    }
}