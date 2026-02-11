package org.studyeasy;

class Data{
    private Object object;

    public Data(Object object) {
        this.object = object;
    }
    public Object getObject() {
        return object;
    }
}

class GenericData<T>{
    private T data;

    public GenericData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}


public class Main {
    public static void main(String[] args) {
//        Data data = new Data("Some Data");
//        String x = (String) data.getObject();
//        System.out.println(x);

        GenericData<String> genericData = new GenericData<>("Some generic data");
        String y = genericData.getData();
        System.out.println(y);

    }

    }


