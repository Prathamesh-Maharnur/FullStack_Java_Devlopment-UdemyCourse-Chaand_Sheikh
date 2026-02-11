package S11_Collections_Framework_continues.SomethingMore_SectionWrapUp;

import java.util.*;

class Name implements Comparable<Name>{
    private String name;

    public Name(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String toString(){
        return "Name{" +
                "name='" + name +"\'" +
                '}';
    }

    @Override
    public int compareTo(Name obj) {
        return name.compareTo(obj.getName());
    }
}

class SomethingMore_SectionWrapUpMain{
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Vivek");
        set1.add("Prathamesh");
        set1.add("Mayur");
        set1.add("Chinmay");
        set1.add("Jitendra");
        set1.add("PRathamesh");

        Set<Name> set2 = new HashSet<>();
        set2.add(new Name("Vivek"));
        set2.add(new Name("Prathamesh"));
        set2.add(new Name("Mayur"));
        set2.add(new Name("Chinmay"));
        set2.add(new Name("Jitendra"));
        set2.add(new Name("PRathamesh"));

        List<String> list1 = new ArrayList<>(set1);
        Collections.sort(list1);
        System.out.println("Collections.sort() method: "+list1);
        System.out.println("\"Prathamesh\" is located at index using Collections.binarySearch() [Wrapper Class]: "+Collections.binarySearch(list1,"Prathamesh"));

        List<Name> list2 = new ArrayList<>();
        list2.addAll(set2);
        Collections.sort(list2);
        System.out.println("\"Vivek\" is located at index using Collections.binarySearch() [Custom Class]: "+Collections.binarySearch(list2,new Name("Vivek")));
    }
}