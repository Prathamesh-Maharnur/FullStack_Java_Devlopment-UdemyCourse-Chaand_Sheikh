package S10_JavaGenerics.ListOfGenericClassObjects;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.LinkedList;

class Demo {
    private Object object;
    private String name;
    private int age;

    public Demo(Object object, String name, int age){
        this.object = object;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return object.toString();
    }
}

class ListOfGenericsClassObjectsMain{
    public static void main(String[] args){
       List<Demo>  d1 = new LinkedList<>();
       d1.add(new Demo("Prathamesh","Maharnur",45));
       d1.add(new Demo("Pratik","Maharnur",45));
       d1.add(new Demo("Sunil","Maharnur",45));
       System.out.println(d1);  // toString() method invoked

       for(Demo i: d1){
           System.out.println(i); // toString() method invoked
       }
    }
}
