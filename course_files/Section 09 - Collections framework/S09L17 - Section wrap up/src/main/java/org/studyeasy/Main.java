package org.studyeasy;
import java.util.LinkedList;
import java.util.List;

class Name{
    private String name;
    public Name(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Object> elements = new LinkedList<>();
        elements.add(new Name("Chaand"));
        elements.add(new Name("Ed"));
        elements.add(new Name("John"));
        elements.add(new Name("Mia"));
        elements.add("Hello");
        elements.add(25);
        elements.add(52.22521);

        System.out.println(elements);
        System.out.println(elements);
        
    }

}