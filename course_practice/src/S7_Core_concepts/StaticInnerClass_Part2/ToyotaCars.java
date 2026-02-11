package S7_Core_concepts.StaticInnerClass_Part2;

public class ToyotaCars{
    NonStaticInner nonStaticInner = new NonStaticInner();
    private int x = 10;

    public NonStaticInner getNonStaticInner(){
        return nonStaticInner;
    }

    public static class Brand{
        private static String brandname = "Toyota";
        public static void tagline(){
            System.out.println("Reliable Cars");
        }
    }

    public class NonStaticInner{
        public void model(String model){
            System.out.println("Make of the car: "+model);
            System.out.println("Brandname: "+ToyotaCars.Brand.brandname);
            System.out.println("Value of x: "+x);
        }
    }
}