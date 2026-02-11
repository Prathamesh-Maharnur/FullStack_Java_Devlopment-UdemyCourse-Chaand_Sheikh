// shortcut to indent whole file --> Ctrl+Shift+Alt+L

class Prgm1_indentation {
    public static void main(String args[]) {

        int n = 10;

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        switch (n) {
            case 10:
                System.out.println("hello it's 10");
                break;
            case 20:
                System.out.println("hello it's 20");
            default:
                System.out.println("Sorry no number provided");
        }
    }
}