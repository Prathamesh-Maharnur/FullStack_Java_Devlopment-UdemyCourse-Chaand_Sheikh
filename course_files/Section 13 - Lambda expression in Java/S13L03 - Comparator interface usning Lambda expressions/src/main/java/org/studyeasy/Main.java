package org.studyeasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
    String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        list.add(new Data("John"));
        list.add(new Data("Gia"));
        list.add(new Data("Chaand"));
        list.add(new Data("Pooja"));
        list.add(new Data("Ed"));

        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        for (Data temp :list) {
            System.out.println(temp);
        }

    }
}
