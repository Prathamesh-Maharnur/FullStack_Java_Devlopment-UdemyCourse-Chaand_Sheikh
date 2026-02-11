package S9_Collections_Framework.Iterators;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;

class IteratorsMain{
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("Prathamesh");
        list.add("Sunil");
        list.add("Maharnur");
        System.out.println("Original list: "+list);
        System.out.println("Calling printList(): ");
        new IteratorsMain().printList(list);

        list.sort(null);
        System.out.println("Sorted List: "+list);
        Collections.reverse(list);
        System.out.println("Reverse List: "+list);

        System.out.println("Calling printDescending(): ");
        new IteratorsMain().printDescending(list);

        System.out.println("Calling modifyList(): ");
        new IteratorsMain().modifyList(list);

    }

    public void printList(List<String> list){
        /* listIterator() belongs to List interface and is subclass of Iterator
           that's why the output of listIterator can be assigned to Iterator
            object
            but it limits to Iterator specific Methods
        */
        Iterator<String> itr = list.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void printDescending(List<String> list){
        ListIterator<String> itr = list.listIterator(list.size());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }

    public void modifyList(List<String> list){
        ListIterator<String> itr = list.listIterator();
        while(itr.hasNext()){
            itr.next();
            itr.set("Pratik");
        }
        System.out.println(list);
    }

}