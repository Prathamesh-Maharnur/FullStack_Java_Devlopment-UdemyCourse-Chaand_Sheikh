package org.studyeasy;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("Chaand");
        listNames.add("John");
        listNames.add("Surya");
        listNames.add("Fatima");
        System.out.println(listNames.remove("Chaand"));
        System.out.println(listNames);
        System.out.println(listNames.set(0,"Steve"));
        System.out.println(listNames);
        System.out.println(listNames.indexOf("Jake"));

    }
}