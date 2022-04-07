package com.tidbits.mebeinglazy.menu.stack;

public class Stack {
    private int top;
    private int a[];
    private int maxsize;

    public Stack(int maxsize){
        this.top = -1;
        this.maxsize = maxsize;
        this.a = new int[maxsize];
    }

    public void push(int data){
        if (top == maxsize-1){
            System.out.println("Stack Full");
        }else{
            top++;
            a[top]= data;
        }
    }

    public void pop(){
    if (top == -1) {
        System.out.println("Stack Empty");
    }else{
        System.out.println(a[top]);
        top--;
    }
    }

    public void peek(){
        System.out.println(a[top]);
    }
}
