package S10_JavaGenerics.BoundedTypeParametersContinues;

import java.util.List;
import java.util.LinkedList;

class Data<T extends Comparable<T>> implements Comparable<Data<T>>{
    private T data;

    public Data(T data){
        this.data = data;
    }

    public String toString(){
        return "Data{"+
                "data = "+
                data+
                '}';
    }

    public T getData(){
        return data;
    }

    @Override
    public int compareTo(Data<T> object){
        return getData().compareTo(object.getData());
    }
}

class BoundedTypeParametersContinuesMain{
    public static void main(String[] args){
        List<Data<Integer>> list = new LinkedList<>();
        list.add(new Data<>(34));
        list.add(new Data<>(45));
        list.add(new Data<>(76));
        list.add(new Data<>(99));

        list.sort(null);
        System.out.println(list);
    }
}