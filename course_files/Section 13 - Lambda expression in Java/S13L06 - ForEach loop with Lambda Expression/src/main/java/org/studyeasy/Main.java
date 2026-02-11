package org.studyeasy;

import java.util.Arrays;
import java.util.List;

class Data{
   private String name;

    public Data(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Data> list = Arrays.asList(new Data("Chaand"), new Data("John"), new Data("Raj"));
        list.forEach(temp ->{
            if(temp.getName().equals("Chaand")){
                System.out.print("Founder StudyEasy: ");
            }
            System.out.println(temp.getName());
        });



    }
}
