package S9_Collections_Framework.CollectionsVectorMAthods;

import java.util.Stack;

class CollectionsVectorMethodMain{
    public static void main(String args[]){
        Stack<Integer> numbers = new Stack<>();
        numbers.push(25);
        numbers.push(35);
        numbers.push(45);
        numbers.push(55);

        System.out.println("Stack: "+numbers);
        System.out.println("Stack search() method (returns element order from top) for 35: "+numbers.search(35));
        System.out.println("Vector indexOf() method (returns element index) for 35: "+numbers.indexOf(35));

        System.out.println("Vector get() method to access index 3: "+numbers.get(3));


    }
}