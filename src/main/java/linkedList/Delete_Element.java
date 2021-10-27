package linkedList;

public class Delete_Element {


    /* Delete Node */
    /* Given a key, deletes the first
       occurrence of key in
     * linked list */
    public static void deleteNode(LinkedList ll, int deleteKey){

        LinkedList.Node prev = null;
        LinkedList.Node temp = ll.head;

        // while for find the prev element of the node to be deleted
        while (temp !=null && temp.data != deleteKey){
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if(temp == null){
            return;
        }
        prev.next = temp.next;

    }

    /* Inserts a new Node at front of the list. */
    public static void push(LinkedList ll, int new_data)
    {
        LinkedList.Node new_node = new LinkedList.Node(new_data);
        new_node.next = ll.head;
        ll.head = new_node;
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        push(llist,7);
        push(llist,1);
        push(llist,3);
        push(llist,2);

        System.out.println("\nCreated Linked list is:");
        llist.printLL();

        deleteNode(llist, 1); // Delete node with data 1

        System.out.println("\nLinked List after Deletion of 1:");
        llist.printLL();
    }


}
