class SwitchCase2{
    public static void main(String args[])
    {
        char x = 'c', y ='d';
        String name = "AutHor";


        switch(Character.toLowerCase(x)){
            case 'a':
                System.out.println("x is a");
                break;
            case 'b':
                System.out.println("x is b");
                break;
            case 'c':
                System.out.println("x is c");
                break;
            case 'd':
                System.out.println("x is d");
                break;
            default:
                System.out.println("x is other than a,b,c,d");
        }


        System.out.println();
        // Enhanced switch case
        switch(y) {
            case 'a' -> System.out.println("y is a");
            case 'b' -> System.out.println("y is b");
            case 'c' -> System.out.println("y is c");
            case 'd' -> System.out.println("y is d");
            default -> System.out.println("y is other than a,b,c,d");
        }


        System.out.println();
        switch(name.toLowerCase())
        {
            case "author" -> System.out.println("Chaand");
            case "team" -> System.out.println("Team StudyEasy");
            case "editor" -> System.out.println("Jack and Jill");
            default -> System.out.println("Invalid Entry");
        }
    }
}
