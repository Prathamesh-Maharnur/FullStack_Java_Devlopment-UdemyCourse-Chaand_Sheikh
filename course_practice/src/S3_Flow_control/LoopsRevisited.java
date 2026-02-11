class LoopsRevisited{
    public static void main(String args[]){
        int i=1,j;

        System.out.println("For Loop:");
        for(i=1,j=1;i<10 && j < 5;i++,j++){
            System.out.println("Value of i = "+i+" and value of j = "+j);
        }

        System.out.println("\nWhile Loop:");
        i=j=1;
        while(i<10 && j<5){
            System.out.println("Value of i = "+i+" and value of j = "+j);
            i++;
            j++;
        }

        i=j=1;
        System.out.println("\nDo While Loop:");
        do{
            System.out.println("Value of i = "+i+" and value of j = "+j);
            i++;
            j++;
        }
        while(i<10 && j<5);
    }
}