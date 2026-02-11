class SwitchCase1{
    public static void main(String args[]){
        int x = 5,y=6;

        switch(x){
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            case 3:
                System.out.println("x is 3");
                break;
            case 4:
                System.out.println("x is 4");
                break;
            default:
                System.out.println("x is other than 1,2,3,4,5");
            case 5:
                System.out.println("x is 5");
                break;
        }
        System.out.println();
        // Enhanced switch case
        switch(y) {
            case 1 -> System.out.println("y is 1");
            case 2 -> System.out.println("y is 2");
            case 3 -> System.out.println("y is 3");
            case 4 -> System.out.println("y is 4");
            default -> System.out.println("y is other than 1,2,3,4,5");
            case 5 -> System.out.println("y is 5");
        }
    }
}