
public class Main {

    private int i = 55;

    public static void main(String[] args) {

        {
            int i = 100;
            System.out.println(i);
        }
        System.out.println("*******");
        System.out.println(new Main().i);
    }
}

