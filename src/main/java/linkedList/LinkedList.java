package linkedList;

public class LinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
        }
    }

    public void printLL(){

      Node n = this.head;

        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println("");
    }

}
