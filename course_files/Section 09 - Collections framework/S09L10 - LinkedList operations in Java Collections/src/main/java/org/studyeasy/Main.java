package org.studyeasy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Chaand");
        list1.add("Jai");
        list1.add("Veeru");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("StudyEasy");
        list2.add("organization");
        list2.add("team");
        new Main().printList(list2);

    }
    void printList(List<String> list){
        for (String name: list) {
            System.out.println(name);
        }
    }
}