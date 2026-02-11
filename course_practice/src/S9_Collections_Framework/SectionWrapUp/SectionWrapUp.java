package S9_Collections_Framework.SectionWrapUp;

import java.util.List;
import java.util.LinkedList;

class Name{
    private String name;

    public Name(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
class SectionWrapUp_ComparableInterfaceWithAnyObjectTypeMain{
    public static void main(String args[]){
        List names = new LinkedList<>();
        names.add(new Name("Prathamesh"));
        names.add(new Name("Mayur"));
        names.add(new Name("Vinayak"));
        names.add("Pratik");
        names.add(150);
        names.add(4524.455864);

       System.out.println(names);
//        names.sort(null); // not possible to  implement sort on object type
        System.out.println(names);


    }
}