package S9_Collections_Framework.LinkedListOperations;

import java.util.Iterator;
import java.util.LinkedList;

class LinkedListOperationsMain{
    public static void main(String args[]){
        LinkedList<String> names = new LinkedList<>();
//        LinkedList<String> students1 = new LinkedList<>();

        names.add("Prathamesh");
        names.add("Mayur");
        names.add("Vinayak");
        names.add("Aadinath");
        System.out.println("Before: "+names);
        names.add("vivek");
        names.add(3,"Chinmay");
        System.out.println("After: "+names);


        System.out.println("Index of 'Vinayak': "+names.indexOf("Vinayak"));
        names.set(4,"Jitendra");
        System.out.println("After modifying index 3 to 'Jitendra': "+names);

        System.out.println("******************************************************");
        names.remove();
        System.out.println("After using remove(): "+names);
        names.remove(4);
        System.out.println("After removing index 4: "+names);
        names.remove("Chinmay");
        System.out.println("After removing object 'Chinmay': "+names);

        System.out.println("******************************************************");
        System.out.println("Using peek(): "+names.peek());
        names.addFirst("Prathamesh");
        System.out.println("Using addFirst(): "+names);
        System.out.println("Using peekLast(): "+names.peekLast());

        System.out.println("******************************************************");
        names.add("Abhitabh");
        names.add("Aishwarya");
        names.add("Abhishek");
        names.add("Abhitabh");
        names.add("Sachin");
        names.add("Mahendra");
        names.add("Abhitabh");
        names.add("Yuvraj");
        System.out.println(names);
        System.out.println("Last occurence of 'Abitabh' at index: "+names.lastIndexOf("Abhitabh"));

    }
}