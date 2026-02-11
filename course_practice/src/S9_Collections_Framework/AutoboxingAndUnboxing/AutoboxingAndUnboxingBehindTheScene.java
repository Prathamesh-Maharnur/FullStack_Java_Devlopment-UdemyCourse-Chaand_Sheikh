package S9_Collections_Framework.AutoboxingAndUnboxing;

import java.util.*;

class AutoBoxingAndUnboxingBehindTheScene{
    public static void main(String args[]){
        double num1,num2;
        int num3;
        ArrayList<Double> numberList = new ArrayList<>();
        numberList.add(Double.valueOf(25));
        numberList.add(Double.valueOf("35.75"));
        numberList.add(Double.valueOf(45.50));

        num1 = numberList.get(2);
        num2 = numberList.get(1).doubleValue();
        num3 = numberList.get(1).intValue();
        System.out.println("numberList[2] assigned to variable num1\nnum1 = "+num1);
        System.out.println("num2 = "+num2);
        System.out.println("num3 = "+num3);

        Integer obj = 100;
        // implicit call to overrided toString() of Integer Class
        System.out.println("obj value printed without defining toString():\n obj = "+obj);
    }
}