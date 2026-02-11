package S11_Collections_Framework_continues.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class QueueMain{
    public static void main(String[] args){
        Queue<Integer> queue1 = new ArrayBlockingQueue<>(5);
        try {
            queue1.add(1);
            queue1.add(2);
            queue1.add(3);
            queue1.add(4);
            queue1.add(5);
            queue1.add(6);
            queue1.remove();
            queue1.add(7);
        }
        catch(Exception e){
            System.out.println("Queue full!!!");
        }
        System.out.println("Element:"+queue1.element());
        System.out.println("Queue: "+queue1);
        System.out.println("**************************************");

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(5);
        queue2.offer(1);
        queue2.offer(2);
        queue2.offer(3);
        queue2.offer(4);
        queue2.offer(5);
        System.out.println("Element 6 added: "+queue2.offer(6));
        queue2.poll();
        System.out.println("Element 7 added: "+queue2.offer(7));
        System.out.println("Peek:"+queue1.peek());
        System.out.println("Queue: "+queue2);
        System.out.println("**************************************");


        Queue<Integer> queue3 = new LinkedBlockingQueue<>(5);
        queue3.offer(1);
        queue3.offer(2);
        queue3.offer(3);
        queue3.offer(4);
        queue3.offer(5);
        System.out.println("Element 6 added: "+queue3.offer(6));
        queue3.poll();
        System.out.println("Element 7 added: "+queue3.offer(7));
        System.out.println("Peek:"+queue1.peek());
        System.out.println("Queue: "+queue3);
        System.out.println("**************************************");
    }
}