package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

class Data{
    public <E> void printListData(List<E> list){
        for (E element: list) {
            System.out.println(element);
        }
    }
    public <E> void printArrayData(E[] arrayData){
        for (E element:arrayData) {
            System.out.println(element);
        }
    }

}

public class Main {
    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(12);
//        list1.add(13);
//        list1.add(14);
//        list1.add(15);
//        list1.add(16);
//        new Data().printListData(list1);
//        List<String> list2 = new ArrayList<>();
//        list2.add("One");
//        list2.add("Two");
//        list2.add("Three");
//        System.out.println("**************");
//        new Data().printListData(list2);

        String[] stringArray = {"One","Two","Three", "four"};
        new Data().printArrayData(stringArray);
        System.out.println("**************");
        Integer[] intArray = {1,2,3,4};
        new Data().printArrayData(intArray);


    }

    }


