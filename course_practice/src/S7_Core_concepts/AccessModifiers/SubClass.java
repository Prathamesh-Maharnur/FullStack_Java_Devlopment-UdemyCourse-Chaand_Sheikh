package S7_Core_concepts.AccessModifiers;

public class SubClass extends Base{
    protected float salary = 1000000;
    void defaultPrint(){
        System.out.println(x);
        System.out.println(name);
        System.out.println(salary);
    }

    private void privatePrint(){
        System.out.println(x);
        System.out.println(name);
        System.out.println(salary);
    }

    public void publicPrint(){
        System.out.println(x);
        System.out.println(name);
        System.out.println(salary);
    }
}