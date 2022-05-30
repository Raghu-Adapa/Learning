package linkedlist2;

public class DeleteNthNode {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode insertNode(ListNode head, int data) {

        ListNode newElement = new ListNode(data);

        ListNode curr = head;
        if(head == null){
            head = newElement;
            return head;
        }

        while(curr!=null && curr.next!=null){

            curr = curr.next;
        }
        curr.next = newElement;

        return head;
    }

    public static void print(ListNode head) {
        ListNode curr = head;
        while(curr!=null){
            System.out.print( curr.val +" -> " );
            curr = curr.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);

        insertNode(head, 2);
        insertNode(head, 3);
        insertNode(head, 4);
        insertNode(head, 5);
        insertNode(head, 6);


        print(head);

        head = removeNthFromEnd(head, 6);

        print(head);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        while(n > 0) {
            n--;
            fast = fast.next;
        }

        while(fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next;
        }

        if(fast == null) {        //if node to remove is head
            return head.next;
        }
        else {
            slow.next = slow.next.next;
        }
        return head;
    }
}
