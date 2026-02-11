package org.studyeasy;

import java.util.LinkedList;
import java.util.List;

class Data<T extends Comparable<T>> implements Comparable<T>{
    private T data;

    public Data(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }

    public T getData() {
        return data;
    }

    @Override
    public int compareTo(T o) {
        return getData().compareTo(o);
    }
}


public class Main {
    public static void main(String[] args) {
        List<Data<Integer>> list = new LinkedList<>();
        list.add(new Data<>(1));
        list.add(new Data<>(4));
        list.add(new Data<>(5));
        list.add(new Data<>(0));

        list.sort(null);
        System.out.println(list);


    }
    }


