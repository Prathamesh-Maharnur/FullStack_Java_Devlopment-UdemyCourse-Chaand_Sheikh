package S7_Core_concepts.StaticElements;

public class StaticMain{
    public static void main(String args[]) {
        System.out.println("First Get & Set:");
        System.out.println("staticVariable = " + TestStatic.getStaticVariable());
        TestStatic.setStaticVariable(10);
        System.out.println("staticVariable = " + TestStatic.getStaticVariable());

        System.out.println("\nSecond Get & Set:");
        System.out.println("staticVariable = " + TestStatic.getStaticVariable());
        TestStatic.setStaticVariable(20);
        System.out.println("staticVariable = " + TestStatic.getStaticVariable());

        System.out.println("\nThird Get & Set:");
        System.out.println("staticVariable = " + TestStatic.getStaticVariable());
        TestStatic.setStaticVariable(30);
        System.out.println("staticVariable = " + TestStatic.getStaticVariable());
    }
}
