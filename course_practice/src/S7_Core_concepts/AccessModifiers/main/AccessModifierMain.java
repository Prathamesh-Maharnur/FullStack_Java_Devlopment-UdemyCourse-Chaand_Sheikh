package S7_Core_concepts.AccessModifiers.main;
import S7_Core_concepts.AccessModifiers.SubClass;

class AccessModifierMain{
    public static void main(String args[]){
        SubClass s = new SubClass();
//        cannot Directly default access entities from diff. package
//        System.out.println(s.x);
//        s.defaultPrint();

//        cannot access the private entities from same or diff. package
//        s.privatePrint()
        s.publicPrint();
        s.Password();

        System.out.println("--------------");

        DefaultClass d = new DefaultClass();
        d.publicPrint();
        System.out.println(d.age);
    }
}

class DefaultClass extends SubClass{
   protected float salary = 123456;
   int age = 45;
   public void publicPrint(){
       System.out.println(super.salary);
       System.out.println(salary);
   }
}