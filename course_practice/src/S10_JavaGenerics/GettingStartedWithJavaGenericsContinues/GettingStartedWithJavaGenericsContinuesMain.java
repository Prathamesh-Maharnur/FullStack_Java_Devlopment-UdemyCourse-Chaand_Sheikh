package S10_JavaGenerics.GettingStartedWithJavaGenericsContinues;

class GenericData<T>{
    private T data;

    public GenericData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }
}

class GettingStartedWithJavaGenericsContinuesMain{
    public static void main(String[] args){
        GenericData g1 = new GenericData<>("Prathamesh");
        String x = (String) g1.getData();
        System.out.println("Using type-cast for Generic class: "+x);

        GenericData<String> g2 = new GenericData<>("Pratik");
        String y = g2.getData();
        System.out.println("Using String initialization in generic: "+y);
    }
}