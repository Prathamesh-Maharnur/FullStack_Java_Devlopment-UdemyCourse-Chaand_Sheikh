package S7_Core_concepts.StaticInnerClass_Part2;

public class StaticInner2Main{
    public static void main(String args[]){
        ToyotaCars toyotaCars = new ToyotaCars();
        /*
              -------NOT SURE-------
        both files are in same folder that's why it is possible to
        access model through obj
        */
        toyotaCars.nonStaticInner.model("Maruti Suzuki");
        ToyotaCars.Brand.tagline();
        toyotaCars.getNonStaticInner().model("Indica");
    }
}