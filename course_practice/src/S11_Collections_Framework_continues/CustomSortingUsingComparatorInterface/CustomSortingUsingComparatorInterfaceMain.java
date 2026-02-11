package S11_Collections_Framework_continues.CustomSortingUsingComparatorInterface;

import java.util.Set;
import java.util.HashSet;

class Data<K extends Integer,V extends String>{
    private K key;
    private V value;

    public Data(K key,V value){
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return "Data{"+
                "key="+key+
                ", value="+value+
                '}';
    }
}

class CustomSortingUsingComparatorInterfaceMain{
    public static void main(String[] args){
        Set<Data<Integer,String>> set = new HashSet<>();
        set.add(new Data<>(1,"Prathamesh"));
        set.add(new Data<>(2,"Mayur"));
        set.add(new Data<>(3,"Vinayak"));
        set.add(new Data<>(4,"Chinmay"));
        set.add(new Data<>(4,"Vivek"));
        set.add(new Data<>(4,"Chinmay"));


        for(Data element: set){
            System.out.println(element);
        }
    }
}