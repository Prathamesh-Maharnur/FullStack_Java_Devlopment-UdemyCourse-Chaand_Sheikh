package S8_Arrays_in_java.InitializationOnArray2;

class ArrayInitialization2Main{
    public static void main(String args[]){
        int[] temperature1 = {20, -4, 36, 39, 25};
        int[] temperature2;
        temperature2 = new int[10];
        temperature2[1] = 10;
        temperature2[3] = 20;
        System.out.println(temperature1[2]);
        System.out.println(temperature2[0]+" "+temperature2[1]+" "+
                temperature2[2]+" "+temperature2[3]);

        float[] values = {10.23f, 10, 45.34245091839485f};
        System.out.println(values[0]+" "+values[1]+" "+values[2]);
    }
}