package linkedList;

public class Insert_Element {

    /* 1. Insert node at starting position */
    /* Time complexity of append is O(1)*/
    public static void instertStarting(LinkedList ll, int item){

        // 1. create new node
        LinkedList.Node newNode = new LinkedList.Node(item);

        // 2. make new Node next as head
        // Now both new node and head points to same existing starting node
        newNode.next = ll.head;

        // 3. now make new node as head
        ll.head = newNode;

    }

    /* 2. Insert after some node */
    /* Time complexity of append is O(1)*/
    public static void insertAfterSomeNode(LinkedList ll, LinkedList.Node prevNode, int item){

        // 1. check if given node is null
        if(prevNode == null){
            System.out.println("Previous node should not be null");
            return;
        }

        // 2. create new node
        LinkedList.Node newNode = new LinkedList.Node(item);

        // 3. next of new node is prev.next
        // now both nodes points to same node
        newNode.next = prevNode.next;

        // 4. previous node next will be new node
        prevNode.next = newNode;
    }

    /* 3. Insert at the end */
    /* Time complexity of append is O(n) where n is the number of nodes in linked list.*/
    /* This method can also be optimized to work in O(1) by keeping an extra pointer to the tail of linked list */

    public static void insertAtEnd(LinkedList ll, int item){

        // 1. create new node
        LinkedList.Node newNode = new LinkedList.Node(item);

        // 2. make next of new node is null
        newNode.next = null;

        // 3. if head is null, new node will be head
        if(ll.head == null){
            ll.head = newNode;
            // return is mandatory
            return;
        }

        // 3. find the last node
        LinkedList.Node last = ll.head;
        while (last.next != null) {
            last = last.next;
        }

        // 4. Change the next of last node
        last.next = newNode;

    }




    /*---------- Main Method  ---------*/
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.head = new LinkedList.Node(10);

        LinkedList.Node second = new LinkedList.Node(20);
        LinkedList.Node third = new LinkedList.Node(30);

        ll.head.next = second;
        second.next = third;

        System.out.println("initial List : is ");
        ll.printLL();

        instertStarting(ll, 5);
        System.out.println("instert 5 at starting ");
        ll.printLL();

        // inster 25 after second node that is 20
        insertAfterSomeNode(ll,second,25);
        System.out.println("initial 25 after 20 ::");
        ll.printLL();

        // insert 60 at end
        insertAtEnd(ll,60);
        System.out.println("insert 60 at the end");
        ll.printLL();

        LinkedList ll1 = new LinkedList();
        // insert 60 at end
        insertAtEnd(ll1,60);
        System.out.println("insert 60 to empty list");
        ll1.printLL();
    }
}
