package org.studyeasy;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list2 = new ArrayList<>();
        list2.add("StudyEasy");
        list2.add("Organization");
        list2.add("Team");
        list2.add("chaand");
        //new Main().printList(list2);
        list2.sort(null);
        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);
        
    }
    void printList(List<String> list){
        Iterator<String> data = list.listIterator();
        while (data.hasNext()){
            System.out.println(data.next());
        }
    }
}