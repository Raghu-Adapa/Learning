package linkedlist2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LL {

    Node head;

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertFirst(int value){

        Node node = new Node(value);

        node.next = head;
        head = node;
    }

    public void insertLast(int value){

        if(head == null){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);

        Node cnode = head;
        while (cnode.next != null ){

            cnode = cnode.next;
        }
        cnode.next = node;
        node.next = null;
    }

    public void insertAt(int value, int index){

        if(head == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);

        Node currentNode = head;
        //Node prev = null;

        for(int i=0; i<index-1;i++){
            if(currentNode != null) {
                currentNode = currentNode.next;
            }
            else {
                System.out.println("Array Out of bounds Exception");
                return;
            }
        }

        node.next = currentNode.next;
        currentNode.next = node;

    }

    public int find(int value){

        Node cnode = head;
        int index = 0;
        while (cnode != null){

            if(cnode.value == value){
                return index;
            }
            index++;
            cnode = cnode.next;
        }
        return -1;
    }

    public int deleteFirst(){

        if(head == null){
            return -1;
        }
        int delValue = head.value;
        head = head.next;

        return delValue;

    }

    public int deleteLast(){

        int deleted = -1;
        if(head == null){
            return deleted;
        }

        Node cnode = head;

        if(cnode.next == null ) {
            deleted = head.value;
            head = null;
            return deleted;
        }else if(cnode.next.next == null){
            deleted = head.next.value;
            head.next = null;
            return deleted;
        }
        while (cnode.next.next !=null){
            cnode = cnode.next;
        }
        deleted = cnode.next.value;
        cnode.next = null;

        return deleted;
    }

    public void makeEmpty(){

        head = null;
    }

    public int deleteAt(int index){
        int deleted = -1;
        if(head == null)
            return deleted;

        if(index == 0){
            return deleteFirst();
        }

        Node cnode = head;

        for(int i=0;i<index-1;i++){
            cnode = cnode.next;
            if(cnode == null){
                return deleted;
            }
        }
        if(cnode.next == null){
            return deleted;
        }
        deleted = cnode.next.value;
        cnode.next = cnode.next.next;

        return deleted;
    }

    public void display(){

        Node currentNode = head;

        while (currentNode!=null){

            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("END");

    }

    public void displayReverse(){

        displayReverse(head);

    }

    private void displayReverse(Node start){

        if(start == null) return;

        displayReverse(start.next);

        System.out.print(start.value + " -> ");

        //System.out.println("Start");

    }

    public Node removeDuplicate(Node head){


        Set<Integer> set = new HashSet<>();

        Node curr = head;

        Node result = head;

        while(curr != null){

            if( ! set.contains(curr.value)){
                set.add(curr.value);

                result.next = curr;
            }
            curr = curr.next;
        }

        if(head == null)
            return head;

        return result.next;


    }


}
