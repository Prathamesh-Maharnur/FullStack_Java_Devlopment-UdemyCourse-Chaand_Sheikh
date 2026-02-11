package S9_Collections_Framework.CompareToMethod;

import java.util.ArrayList;

class CompareToMethodMain{
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();
        names.add("Prathamesh");
        names.add("Sunil");
        names.add("Maharnur");

        // compareTo(Object obj),
        // compareTo(String AnotherString),
        // compareToIgnoreCase(String AnotherString)

        System.out.println(names.get(0).compareTo("Prathamesh"));
        System.out.println(names.get(1).compareTo("Suni"));
        System.out.println(names.get(2).compareTo("Maharnurr"));
        System.out.println(names.get(2).compareToIgnoreCase("MaHaRnUr"));
    }
}