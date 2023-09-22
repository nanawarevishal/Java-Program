package collection.Queue.PriorityQueue;

import java.util.LinkedList;
import java.util.Queue;

class QueueDemo{

    public static void main(String[] args) {
        
        Queue q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        // Poll
        System.out.println(q.poll());
        System.out.println(q);

        // Peek
        System.out.println(q.peek());
        System.out.println(q);

        // remove
        System.out.println(q.remove());
        System.out.println(q);

        // element
        System.out.println(q.element());
        System.out.println(q);

        // add
        q.add(60);
        System.out.println(q);

    }
}


// Note :- remove() throws the runtime exception while poll() method doesn't throws the runtime exception, when queue is empty.