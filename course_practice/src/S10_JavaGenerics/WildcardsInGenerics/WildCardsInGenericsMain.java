package S10_JavaGenerics.WildcardsInGenerics;

/*
    extends --> for reading values and restrict writing
    super --> for writing values and restrict reading
*/

import java.util.List;
import java.util.ArrayList;

class Vehicle{
    private int id;

    public Vehicle(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return "Vehicle{"+
                "id = "+
                id+'}';
    }
}

class Car extends Vehicle{
    private String model;

    public Car(int id,String model){
        super(id);
        this.model = model;
    }

    public String toString(){
        return "Car{"+
                "model='"+
                model+"'} "+
                super.toString();
    }
}

class WildCardsInGenericsMain{
    public static void main(String[] args){
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(1));
        list.add(new Vehicle(2));
        list.add(new Vehicle(3));
        list.add(new Vehicle(4));
        list.add(new Car(10,"Volvo S90"));
        new WildCardsInGenericsMain().display1(list);

        display2(list);
    }

    public void display1(List<? super Vehicle> list){
        System.out.println("***************************************");
        System.out.println("Lower bounded Wildcards:");
        for(Object data: list){
            System.out.println(data);
        }
        System.out.println("***************************************");
    }

    public static void display2(List<? extends Vehicle> list){
        System.out.println("***************************************");
        System.out.println("Upper bounded Wildcards:");
        for(Vehicle data: list){
            System.out.println(data);
        }
        System.out.println("***************************************");
    }
}