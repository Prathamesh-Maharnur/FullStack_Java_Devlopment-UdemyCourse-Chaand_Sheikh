package org.studyeasy;
  /*    T - Type
        E- Element
        K - Key
        N - number
        V - Value       */

class Data<K, V>{
    private  K key;
    private  V value;

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

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
    public <E, N> void  display(E element, N number){
        System.out.println("Element: "+element+ " Number: "+number);
    }

}

public class Main {
    public static void main(String[] args) {
        Data<Integer, String> data = new Data(10, "Chaand");
        System.out.println("Key : "+data.getKey() + " Value: "+data.getValue());
        data.display("Test", 40);

    }

    }


