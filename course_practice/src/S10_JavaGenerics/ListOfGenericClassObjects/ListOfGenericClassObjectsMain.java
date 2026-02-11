package S10_JavaGenerics.ListOfGenericClassObjects;

import java.util.List;
import java.util.LinkedList;

class Data{
    private Object object;

    public Data(Object object){
        this.object = object;
    }

    public String toString(){
        return object.toString();
    }
}

class Data2<T>{
    private T object;

    public Data2(T object){
        this.object = object;
    }

    public String toString(){
        return object.toString();
    }
}
class ListOfGenericClassObjectMain{
    public static void main(String[] args){
        List<Data> d1 = new LinkedList<>();
        d1.add(new Data("Prathamesh"));
        d1.add(new Data('@'));
        d1.add(new Data(45.251));
        System.out.println(d1);

        for(Object i :d1){
            System.out.println(i);
        }
        System.out.println("*****************************");
        for(Data i :d1){
            System.out.println(i);
        }
        System.out.println("*****************************");


        List<Data2<String>> d2 = new LinkedList<>();
        d2.add(new Data2<String>("Prathamesh"));
        d2.add(new Data2<String>("Sunil"));
        d2.add(new Data2<String>("Maharnur"));

        System.out.println("*****************************");
        for(Object i :d2){
            System.out.println(i);
        }
        System.out.println("*****************************");
        for(Data2<String> i :d2){
            System.out.println(i);
        }

    }
}