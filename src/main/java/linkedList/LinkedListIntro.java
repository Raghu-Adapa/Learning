package linkedList;

public class LinkedListIntro {

    // head is the start point of linked list
    // Starting node;
    static Node head;


    /* Linked list Node.  This inner class is made static so that
       main() can access it */
    static class Node{
        // Node is have two parts, one is data and another one is reference for next node.
        int data;
        Node next;

        // Constructor
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void printlinkedlist(){

        Node n = head;

        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }

    }


    public static void main(String[] args) {

        LinkedListIntro ll = new LinkedListIntro();

        ll.head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);

        ll.head.next = second;
        second.next = third;

        // printing the linked list
        ll.printlinkedlist();

    }

}
