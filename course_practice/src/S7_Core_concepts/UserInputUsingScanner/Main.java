package S7_Core_concepts.UserInputUsingScanner;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        String name, gender;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        name = scanner.next();
        System.out.println("Hello," + name + "!,\nEnter your gender: ");
        gender = scanner.nextLine();
        gender = scanner.nextLine();
        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Name: " + name + "\nGender: " + gender + "\tAge: " + age);
    }
}