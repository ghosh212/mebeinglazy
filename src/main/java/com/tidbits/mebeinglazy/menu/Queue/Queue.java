package com.tidbits.mebeinglazy.menu.Queue;

public class Queue {

    private int maxsize;
    private int a[];
    private int rear;
    private int front;
    private int values;

    public Queue(int maxsize){
        this.maxsize = maxsize;
        this.a = new int[maxsize];
        this.front = -1;
        this.rear = -1;
    }

    //inserting into queue
    public void enqueue(int data){
        if (rear == maxsize){
            System.out.println("Queue Full");
        }else {
            if (front == -1) {
                front = 0;
                rear++;
                a[rear] = data;
                values++;
            }
        }
    }

    //deleting from queue
    public void dequeue(){
       if (front == -1 ){
            System.out.println("Queue Empty");
        }else{
            System.out.println(a[front]);
            front++;
        }
    }
}
