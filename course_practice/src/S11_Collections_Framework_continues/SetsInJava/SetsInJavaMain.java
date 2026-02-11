package S11_Collections_Framework_continues.SetsInJava;

import java.util.Set;
import java.util.HashSet;

class SetsInJava{
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Prathamesh");
        set.add("Sunil");
        set.add("Maharnur");
        set.add("Pratik");
        set.add("Maharnur");

        System.out.println(set);

        for(String element:set){
            System.out.print(element+"\t");
        }

        System.out.println("\n\"Prathamesh\" contains in set: "+set.contains("Prathamesh"));
    }
}