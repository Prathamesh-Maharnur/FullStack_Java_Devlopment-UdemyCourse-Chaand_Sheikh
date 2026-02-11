package S10_JavaGenerics.GenericMethodsInJava;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

class Data{
    public <E> void printListData(List<E> list){
        for(E element: list){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public <E> void printArrayData(E[] array){
        for(E element: array){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}

class GenericMethodsInJavaMain{
    public static void main(String args[]){
        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.print("LinkedList: ");
        new Data().printListData(list1);
        System.out.println("*****************************************");

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        System.out.print("ArrayList: ");
        new Data().printListData(list2);
        System.out.println("*****************************************");

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array: ");
        new Data().printArrayData(intArray);
        System.out.println("*****************************************");
        String[] stringArray = {"One", "Two", "Three", "Four", "Five"};
        System.out.print("String Array: ");
        new Data().printArrayData(stringArray);
        System.out.println("*****************************************");
    }
}
