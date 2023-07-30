package Collections.Queue;

import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {

        //FIFO
        //Queue q = new PriorityQueue(); Error?
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(1);//add() will throw an IllegalStateException if no space is currently
        //available in the Queue, otherwise add method will return true
        pQueue.offer(5);//offer() method will return false if the element cannot be
        // inserted due to capacity
        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());



    }
}
