package S9_Collections_Framework.StackMethods;

import java.util.Stack;

class StackMethodsMain{
    public static void main(String args[]){
        Stack<Integer> numbers = new Stack<>();

        numbers.push(32);
        numbers.push(78);
        numbers.push(45);
        numbers.push(12);
        numbers.push(89);
        numbers.push(56);
        System.out.println("Before: "+numbers);

        System.out.println("Element poped: "+numbers.pop());
        System.out.println("After: "+numbers);

        System.out.println("1-based location of 12: "+numbers.search(12));
        System.out.println("Element at top of Stack: "+numbers.peek());
        System.out.println("Stack empty state: "+numbers.isEmpty());

    }
}