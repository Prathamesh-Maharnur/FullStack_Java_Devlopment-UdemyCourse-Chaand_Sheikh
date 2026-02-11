package S8_Arrays_in_java.InitializationOnArray;

class ArrayInitializationMain{
    public static void main(String args[]){
        String[] names1 = {"Prathamesh", "Maharnur", "Pratik"};
        System.out.println(names1[0]);
        System.out.println(names1[2]);

        System.out.println("******************************************");
        String[] names2;
        names2 = new String[10];
        names2[2] = "Prathamesh";
        names2[4] = "Maharnur";
        System.out.println(names2[2]);
        System.out.println(names2[4]);
    }
}