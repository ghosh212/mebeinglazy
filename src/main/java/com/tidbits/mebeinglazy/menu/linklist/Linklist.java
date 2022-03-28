package com.tidbits.mebeinglazy.menu.linklist;

import org.springframework.util.ObjectUtils;

public class Linklist {

    Node startNode;

    public static Linklist insertNode(Linklist list, int data){
        if (ObjectUtils.isEmpty(data)){
            return null;
        }
        Node newnode = new Node(data);
        newnode.next = null;
        if (list.startNode == null) {
            list.startNode = newnode;
        }else {
            //need to traverse
            //creating a pointer to last node
            Node lastNode = list.startNode;
            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next = newnode;
        }
            return  list;
    }

    public static Linklist deleteNode(Linklist list, int data) {
        if (ObjectUtils.isEmpty(data)) {
            return null;
        }

        Node previous = null;
        Node after = null;
        Node current = list.startNode;

        if (current.data == data) {
            list.startNode = current.next; //head pointer changed.
        } else {
            for (Node node = current; node.next.next!= null; node = node.next.next) {
                if (node.data == data) {
                    previous = node.next;
                    after = node.next.next;
                    previous.next = after;
                }
            }
        }
        return list;
    }

    public static void printList(Linklist list){
        Node currentNode = list.startNode;
        for (Node node = currentNode;node.next!=null;node= node.next){
            System.out.println(node.data);
        }
    }



}
