package com.tidbits.mebeinglazy.menu.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
       queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(3);
    }
}
