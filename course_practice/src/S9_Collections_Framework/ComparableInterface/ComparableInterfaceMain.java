package S9_Collections_Framework.ComparableInterface;

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
        if(name.length() == obj.name.length()){
            return 0;
        }
        else if(name.length() > obj.name.length()){
            return 1;
        }
        else{
            return -1;
        }
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
        System.out.println("After sorting(Length based): "+names);


    }
}