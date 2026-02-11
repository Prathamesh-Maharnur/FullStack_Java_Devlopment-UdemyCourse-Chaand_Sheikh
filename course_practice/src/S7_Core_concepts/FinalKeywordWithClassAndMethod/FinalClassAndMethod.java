package S7_Core_concepts.FinalKeywordWithClassAndMethod;
import S7_Core_concepts.FinalKeywordWithClassAndMethod.*;

public class FinalClassAndMethod{
    public static void main(String args[]){
        Child_FinalClassAndMethod child = new Child_FinalClassAndMethod();
        child.USA();
        child.India();
        // We cannot inherit and override any class and method respectively
        Final f = new Final();
        f.display();
        f.finalMethod();
    }
}