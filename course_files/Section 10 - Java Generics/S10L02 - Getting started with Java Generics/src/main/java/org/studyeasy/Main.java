package org.studyeasy;

import java.util.LinkedList;
import java.util.List;

class Data{
    private Object object;

    public Data(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }

    public Object getObject() {
        return object;
    }
}
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
        List<Data> elements = new LinkedList<>();
        elements.add(new Data("Chaand"));
        elements.add(new Data('£'));
        elements.add(new Data(25));
        elements.add(new Data(52.65));
        elements.add(new Data(new Name("StudyEasy")));
        System.out.println(elements);

        String x = new Data("Hello World").toString();
        System.out.println(x);

    }

    }


