package S7_Core_concepts.FinalKeywordWithClassAndMethod;

import java.sql.SQLOutput;

public class Parent_FinalClassAndMethod{
    public final void India(){
        System.out.println("India is Great!!!!!!");
    }

    public void USA(){
        System.out.println("USA is fantastic!!!");
    }


}

// nested static final also works
final class Final{
    public void display(){
        System.out.println("This is a Final Class - non final method!!!");
    }

    public void finalMethod(){
        System.out.println("his is a Final Class - final method!!!");
    }
}

