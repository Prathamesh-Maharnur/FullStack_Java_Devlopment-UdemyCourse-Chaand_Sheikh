package org.studyeasy;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    // Getting started with Collections
        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("Chaand");
        listNames.add("John");
        listNames.add("Steve");
        listNames.add("Pooja");
        listNames.add("Rahul");
        listNames.add("Angel");
        listNames.add("Lisa");
        listNames.add("Jenifer");
        System.out.println(listNames);
//        for (String temp: listNames) {
//            System.out.println(temp);
//        }

        System.out.println(listNames.get(3));
        listNames.remove(0);
        System.out.println(listNames);


    }
}