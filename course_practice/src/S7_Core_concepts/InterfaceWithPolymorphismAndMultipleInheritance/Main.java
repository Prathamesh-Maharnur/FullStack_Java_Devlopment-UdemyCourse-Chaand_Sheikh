package S7_Core_concepts.InterfaceWithPolymorphismAndMultipleInheritance;

public class Main{
    public static void main(String args[]){

        System.out.println("Polymorphism:-");
        Phone p = new SamsungPhone();
        System.out.println("Samsung phone:\tprocessor-"+p.processor()
        +"\t space-"+p.spaceInGb());

        p = new Iphone();
        System.out.println("Iphone:\tprocessor-"+p.processor()
                +"\t space-"+p.spaceInGb());

        Iphone p1 = new Iphone();
        System.out.println("\nMultiple inheritance:-");
        System.out.println("Iphone:\nprocessor-"+ p1.processor()+"\tspace-"+ p1.spaceInGb()+"\tfeature-"+
                p1.airdrop());
    }
}