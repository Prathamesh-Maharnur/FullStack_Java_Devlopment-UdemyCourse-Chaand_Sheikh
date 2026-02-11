package S9_Collections_Framework.ArrayListContinues;

import java.util.ArrayList;

class ArratyListContinuesMain{
    public static void main(String args[]){
        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("Prathamesh");
        listNames.add("Mayur");
        listNames.add("Vinayak");
        listNames.add("Vivek");
        System.out.println(listNames);
        listNames.set(3,"Aadinath");
        System.out.println("Modifying Vivek to Aadinath:\n"+listNames);
        System.out.println("Index of Vinayak = "+listNames.indexOf("Vinayak"));
    }
}