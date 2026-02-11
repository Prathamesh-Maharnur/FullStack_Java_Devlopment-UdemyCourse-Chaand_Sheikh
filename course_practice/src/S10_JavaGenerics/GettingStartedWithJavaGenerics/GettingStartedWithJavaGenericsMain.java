package S10_JavaGenerics.GettingStartedWithJavaGenerics;

import java.util.List;
import java.util.LinkedList;

class Data{
    private Object objectVar;
    String surname;

    public Data(Object objectVar,String surname){
        this.objectVar = objectVar;
        this.surname = surname;
    }
    public Object getObject(){
        return objectVar;
    }
    @Override
    public String toString(){
        return objectVar.toString()+" "+surname;
    }
}

class Name{
    private String nameVar;

    public Name(String nameVar){
        this.nameVar = nameVar;
    }

    @Override
    public String toString(){
        return nameVar;
    }
}

class GettingStartedWithJavaGenerics{
    public static void main(String args[]){
        List<Data> elements = new LinkedList<>();
        elements.add(new Data("Prathamesh","Maharnur"));
        elements.add(new Data("Sunil","SSK"));
        elements.add(new Data("Pratik","SSK"));
        elements.add(new Data(7845,"SSK"));
        elements.add(new Data(true,"SSK"));
        System.out.println(elements);  // toString() of Data class called


        String x1 = new Data("Vaishali","Maharnur").toString();
        System.out.println("String representation using toString(): "+x1);

        // typecasting can be done for compatible types
        Data x2 = new Data("Vaishali","Maharnur");
        String x3 = (String) x2.getObject();
        System.out.println("String representation using typecast: "+ x3);

        Data y = new Data("Vaishali","Maharnur");
        // sout calls the toString() method internally
        System.out.println("String representation using getter: "+y.getObject());
        System.out.println("Object info: "+y);

        /*
         when the toString() is not overridden for Data
         then the elements will utilise the default Object.toString()
         BUT in case of getter for object it calls the objectAttribute.toString()
         eg.y.getObject() --> "Vaishali" --> String.toString()
         this display dynamic dispatch Polymorphism being utilised
         */


    }
}