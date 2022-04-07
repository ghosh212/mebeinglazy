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

      public static void printMiddle(Linklist list){
        Node currentNode = list.startNode;
        Node middleNode = list.startNode;
        int lenghth =0;
        while(currentNode.next!=null){
            lenghth ++;
            if (lenghth %2 ==0){
                middleNode = middleNode.next;
            }
            currentNode = currentNode.next;
            if (lenghth%2 ==1){
                middleNode = middleNode.next;
            }
        }
      }
      //If singly LinkedList contains Cycle then following would be true
    // * 1) pointer 1 and pointer2 will point to same node i.e. they meet
    //two pointer approach
      //if the link list is cyclic THEN THE
      public static boolean isCyclic(Linklist list){
        Node pointer1 = list.startNode;
        Node pointer2 = list.startNode;
        while(pointer1!=null && pointer1.next!=null){
            pointer1 = pointer1.next.next;
            pointer2 = pointer2.next;
        }
        if (pointer1 == pointer2){
            return true;
        }
        return  false;
      }

      public static void removeDuplicates(Linklist list){
        Node ptr1 = null;
        Node ptr2 = null;
        ptr1 = list.startNode;
        while (ptr1!=null && ptr1.next!=null){
            ptr2=ptr1;
            while (ptr2.next!=null){
                //duplicate found
                if (ptr1.data == ptr1.next.data){
                    ptr2.next = ptr2.next.next;
                }else{
                    ptr2= ptr2.next;
                }
            }
            ptr1= ptr1.next;
        }
      }
}
