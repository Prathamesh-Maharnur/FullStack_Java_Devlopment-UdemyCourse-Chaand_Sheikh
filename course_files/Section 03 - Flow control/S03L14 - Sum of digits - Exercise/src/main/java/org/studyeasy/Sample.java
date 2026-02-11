package org.studyeasy;

public class Sample {
    public static void main(String[] args) {

        int x = 1;
        int sumOfDigits = 0;
        while (true){
            sumOfDigits = sumOfDigits +(x%10);
            x = x/10;
            if(x <1 ){
                break;
            }
        }
        System.out.println("Sum of digits is "+sumOfDigits);

    }
}
