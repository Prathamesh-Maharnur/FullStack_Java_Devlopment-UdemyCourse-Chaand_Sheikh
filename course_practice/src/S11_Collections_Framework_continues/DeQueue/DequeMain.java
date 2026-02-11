package S11_Collections_Framework_continues.DeQueue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.ArrayDeque;

class DequeMain{
    public static void main(String[] args){
        Deque<Integer> deque1 = new LinkedBlockingDeque<>(5);
        deque1.offer(1);
        deque1.offer(2);
        deque1.offer(3);
        deque1.offer(4);
        deque1.offerFirst(5);
        deque1.offerLast(6);
        deque1.offerFirst(7);
        deque1.offerLast(8);
        System.out.println("LinkedBlockingDeque:\nDeque Adding: "+deque1);
        deque1.pollFirst();
        deque1.pollLast();
        System.out.println("After Removing:"+deque1);
        System.out.println("**************************************");

        Deque<Integer> deque2 = new ArrayDeque<>(5);
        deque2.offer(1);
        deque2.offer(2);
        deque2.offer(3);
        deque2.offer(4);
        deque2.offerFirst(5);
        deque2.offerLast(6);
        deque2.offerFirst(7);
        deque2.offerLast(8);
        System.out.println("ArrayDeque:\nDeque Adding: "+deque2);
        deque2.pollFirst();
        deque2.pollLast();
        System.out.println("After Removing:"+deque2);

    }
}