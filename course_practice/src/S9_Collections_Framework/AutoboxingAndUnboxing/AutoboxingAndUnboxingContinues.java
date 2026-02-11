package S9_Collections_Framework.AutoboxingAndUnboxing;

import java.util.ArrayList;

class IntWrapper{
    public int num;

    public IntWrapper(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }
}
class AutoboxingAndUnboxingContinues{
    public static void main(String args[]){
        int i;
        ArrayList<Integer> numberList1 = new ArrayList<>();
        numberList1.add(35);  //Autoboxing
        numberList1.add(36);
        numberList1.add(46);
        System.out.println(numberList1);
        i = numberList1.get(1);  //Auto unboxing
        System.out.println("The value of i after Auto unboxing numberList[1]: "+i);

        ArrayList<IntWrapper> numberList2 = new ArrayList<>();
        numberList2.add(new IntWrapper(20));  // boxing
        numberList2.add(new IntWrapper(30));
        numberList2.add(new IntWrapper(40));
        System.out.print("[");
        for(IntWrapper j: numberList2){
            System.out.print(j.getNum()+" ");   //unboxing
        }
        System.out.print("]\n");
        i = numberList2.get(1).getNum();  // unboxing
        System.out.println("The value of i after unboxing numberList2[1] : "+i);

    }
}