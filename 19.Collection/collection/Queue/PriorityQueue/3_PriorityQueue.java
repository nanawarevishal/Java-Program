package collection.Queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

import javax.management.Query;

class PrQueue{

    public static void main(String[] args) {
        
        PriorityQueue pq = new PriorityQueue<>();

        pq.offer("Badhe");
        pq.offer("Ashish");
        pq.offer("Kanha");
        pq.offer("Rahul");

        System.out.println(pq);
    }
}
