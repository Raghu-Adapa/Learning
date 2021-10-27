package leetcode;

import linkedList.LinkedList;

public class L2_LL_AddTwoNumbers {

    //Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

      public static void printLL(ListNode l){

          ListNode head = l;

          while (head!=null){
              System.out.print(head.val+" ");
              head = head.next;
          }
      }

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode dummyHead = new ListNode(0);
            ListNode p = l1, q = l2, curr = dummyHead;
            int carry = 0;
            while (p != null || q != null) {
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (p != null) p = p.next;
                if (q != null) q = q.next;
            }
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }
            return dummyHead.next;
        }

    public static void main(String[] args) {

     /*   ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next= new ListNode(9);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next= new ListNode(4);
        l2.next.next.next= new ListNode(9);

        ListNode res1 = addTwoNumbers(l1,l2);



        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);

        ListNode res2 = addTwoNumbers(l3,l4);

*/

        ListNode l5 = new ListNode(9);

        ListNode l6 = new ListNode(1);
        l6.next = new ListNode(9);
        l6.next.next= new ListNode(9);
        l6.next.next.next= new ListNode(9);
        l6.next.next.next.next= new ListNode(9);
        l6.next.next.next.next.next= new ListNode(9);
        l6.next.next.next.next.next.next= new ListNode(9);
        l6.next.next.next.next.next.next.next= new ListNode(9);
        l6.next.next.next.next.next.next.next.next= new ListNode(9);
        l6.next.next.next.next.next.next.next.next.next= new ListNode(9);


        ListNode res3 = addTwoNumbers(l5,l6);
        System.out.println("final result is : ");
        printLL(res3);


    }
}
