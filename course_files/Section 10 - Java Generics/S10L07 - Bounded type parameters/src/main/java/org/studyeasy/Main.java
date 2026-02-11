package org.studyeasy;
import java.util.List;

class Data<K extends Integer,V>{
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    public <N extends Number,E> void display(N number, E element){
        System.out.println("Number: "+number+ " Element: "+element);
    }
}

public class Main {
    public static void main(String[] args) {
        Data<Integer,String> data = new Data<>(1, "Chaand");
        data.display(25.5254f,'£');


        }
    }


