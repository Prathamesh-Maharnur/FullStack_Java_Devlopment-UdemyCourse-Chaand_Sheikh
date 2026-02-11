package org.studyeasy;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(25);
        numbers.push(35);
        numbers.push(45);
        int x = numbers.indexOf(45);
        System.out.println(x);
        System.out.println(numbers.get(2));


    }
}