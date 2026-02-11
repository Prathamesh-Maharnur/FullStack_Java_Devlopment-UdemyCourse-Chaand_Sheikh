class Prgm2_continue{
    public static void main(String args[]){
        int i;
        for(i=1;i<=10;i++){
            if(i == 5){
                System.out.println("The given statement entered in continue");
                continue;
            }
            System.out.println(i);
        }
    }
}