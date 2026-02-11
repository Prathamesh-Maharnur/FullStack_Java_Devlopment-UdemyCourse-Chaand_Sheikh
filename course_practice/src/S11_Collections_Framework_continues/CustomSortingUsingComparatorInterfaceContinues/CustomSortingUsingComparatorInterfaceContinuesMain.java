package S11_Collections_Framework_continues.CustomSortingUsingComparatorInterfaceContinues;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Data<K extends Integer,V extends String>{
    private K key;
    private V value;

    public Data(K key,V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public String toString(){
        return "Data{"+
                "key="+key+
                ", value="+value+
                '}';
    }
}

class CustomSortingUsingComparatorInterfaceContinues{
    public static void main(String[] args){

        Comparator<Data<Integer,String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
                if(obj1.getKey() > obj2.getKey()){
                    return 1;
                }else if(obj1.getKey() < obj2.getKey()){
                    return -1;
                }else{
                    return 0;
                }
            }
        };

        Set<Data<Integer,String>> set = new TreeSet<>(COMPARE_KEY);
        set.add(new Data<>(1,"Prathamesh"));
        set.add(new Data<>(2,"Mayur"));
        set.add(new Data<>(3,"Vinayak"));
        set.add(new Data<>(4,"Chinmay"));
        set.add(new Data<>(4,"Vivek"));
        set.add(new Data<>(2,"Mayur"));

        for(Data element : set){
            System.out.println(element);
        }
    }
}