class Prgm1_break{
    public static void main(String args[]){
        int i;
        for(i=1;i<=10;i++){
            if(i == 5){
                System.out.println("The given statement is entered in break");
                break;
            }
            System.out.println(i);
        }
    }
}