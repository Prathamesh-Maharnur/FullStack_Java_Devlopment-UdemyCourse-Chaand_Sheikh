package S13_LambdaExpressions.ComparatorInterfaceUsingLambdaExpresssionsContinues;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Data{
    String name;

    public Data(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}

class ComparatorInterfaceUsingLambdaExpresssionsContinuesMain{
    public static void main(String[] args){
        List<Data> list = new ArrayList<>();
        list.add(new Data("Vivek"));
        list.add(new Data("Jitendra"));
        list.add(new Data("Mayur"));
        list.add(new Data("Vinayak"));
        list.add(new Data("Chinmay"));
        list.add(new Data("Prathamesh"));

        Collections.sort(list,(o1, o2) -> {
            if(o1.getName().length() < o2.getName().length()){
                return -1;
            } else if (o1.getName().length() > o2.getName().length()) {
                return 1;
            }
            else{
                return 0;
            }
        });

        System.out.println("Sorted using String length:");
        for(Data temp: list){
            System.out.println(temp);
        }
    }
}