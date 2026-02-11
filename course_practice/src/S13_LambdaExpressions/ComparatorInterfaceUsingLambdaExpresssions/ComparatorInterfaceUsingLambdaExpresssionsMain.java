package S13_LambdaExpressions.ComparatorInterfaceUsingLambdaExpresssions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

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
class ComparatorInterfaceUsingLambdaExpressionsMain{
    public static void main(String[] args){
        List<Data> list = new ArrayList<>();
        list.add(new Data("Vivek"));
        list.add(new Data("Jitendra"));
        list.add(new Data("Mayur"));
        list.add(new Data("Vinayak"));
        list.add(new Data("Chinmay"));
        list.add(new Data("Prathamesh"));

        Collections.sort(list, new Comparator<Data>() {
            @Override
            public int compare(Data data1, Data data2) {
                return data1.getName().compareTo(data2.getName());
            }
        });

        System.out.println("Sorted using alphabetical order:");
        for(Data temp: list){
            System.out.println(temp);
        }
    }
}