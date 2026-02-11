package org.studyeasy;
import java.util.LinkedList;
import java.util.List;

class Data<T>{
    private T object;

    public Data(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        List<Data<String>> elements = new LinkedList<>();
        elements.add(new Data<>("Chaand"));
        elements.add(new Data<>("StudyEasy"));

        for (Data<String> data:elements) {
            System.out.println(data);
        }


    }

    }


