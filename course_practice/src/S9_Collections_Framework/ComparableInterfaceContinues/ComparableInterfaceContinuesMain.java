package S9_Collections_Framework.ComparableInterfaceContinues;

import java.util.List;
import java.util.LinkedList;

class Name implements Comparable<Name>{
    private String name;

    public Name(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Name obj) {
        return this.name.compareTo(obj.name);
    }
}
class ComparableInterfaceMain{
    public static void main(String args[]){
        List names = new LinkedList<>();
        names.add(new Name("Prathamesh"));
        names.add(new Name("Mayur"));
        names.add(new Name("Vinayak"));

        System.out.println("Before Sorting: "+names);
        names.sort(null);
        System.out.println("After sorting(Alphabetically): "+names);


    }
}