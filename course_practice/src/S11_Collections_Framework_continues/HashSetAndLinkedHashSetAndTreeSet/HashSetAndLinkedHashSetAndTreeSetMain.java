package S11_Collections_Framework_continues.HashSetAndLinkedHashSetAndTreeSet;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class HashSetAndLinkedHashSetAndTreeSetMain{
    public static void main(String[] args){
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("Z");
        set1.add("Alex");
        set1.add("Zebra");
        set1.add("Alex");
        System.out.println("HashSet: "+set1);
        System.out.println("***********************************************");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Zebra");
        set2.add("Alex");
        set2.add("Charles");
        set2.add("Prathamesh");
        System.out.println("LinkedHashSet: "+set2);
        System.out.println("***********************************************");

        Set<String> set3 = new TreeSet<>();

        for(int i=20;i>=0;i-=2){
            set3.add("A"+i);
        }
        System.out.println("TreeSet: ");
        for(String element:set3){
            System.out.println(element);
        }
        System.out.println("***********************************************");

    }
}