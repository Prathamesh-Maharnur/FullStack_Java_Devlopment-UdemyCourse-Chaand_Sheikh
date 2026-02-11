package S9_Collections_Framework.ListInterface;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class ListInterfaceMain{
    public static void main(String args[]){
        LinkedList<String> heroes = new LinkedList<>();
        heroes.add("Akshay");
        heroes.add("Makarand");
        heroes.add("Laxmikant");

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Entertainment");
        movies.add("De dakka");
        movies.add("Majha Chakula");

        new ListInterfaceMain().printList(heroes);
        new ListInterfaceMain().printList(movies);
    }

    public void printList(List<String> l){
        for(String i: l){
            System.out.println(i);
        }
        System.out.println("**************************");
    }
}