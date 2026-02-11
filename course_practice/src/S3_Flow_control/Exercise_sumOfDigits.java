class Exercise_sumOfDigits{
    public static void main(String args[]){
        int num = 1234,sumOfDigits=0;
        while(true){
            sumOfDigits += num%10;
            num /= 10;
            if(num == 0){
                break;
            }
        }
        System.out.println("Sum of digits: "+sumOfDigits);
    }
}