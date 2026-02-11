import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's your age?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("Age: "+ age);
        scanner.close();

    }
}


