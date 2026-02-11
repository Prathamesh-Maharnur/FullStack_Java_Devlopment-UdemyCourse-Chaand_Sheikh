package S8_Arrays_in_java.CallByValue;

class CallByValueMain{
    public static void main(String args[]){
        int a = 10;
        CallByValueMain main = new CallByValueMain();
        System.out.println("Main Method: "+a);
        main.DisplayValue(a);
        System.out.println("Main Method: "+a);
    }

    public void DisplayValue(int a){
        System.out.println("Display Method: "+a);
        a = 20;
        System.out.println("Display Method: "+a);
    }
}