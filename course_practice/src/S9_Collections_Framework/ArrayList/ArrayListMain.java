package S9_Collections_Framework.ArrayList;

import java.util.ArrayList;

class ArrayListMain{
    public static void main(String args[]){
        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("Prathamesh");
        listNames.add("Mayur");
        listNames.add("Vinayak");
        listNames.add("Aadinath");
        listNames.add("Samruddhi");

        System.out.println("names = "+listNames);
        System.out.println("For Each loop:");
        for(String name:listNames){
            System.out.println(name);
        }

        listNames.add(4,"Vivek");
        System.out.println("Adding vivek to index 4 "+listNames);

        listNames.remove("Aadinath");
        listNames.remove(0);
        System.out.println("Removing elements by content(Aadinath) and index position(0:Prathamesh): ");
        System.out.println(listNames);
    }
}