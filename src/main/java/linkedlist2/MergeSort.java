package linkedlist2;

public class MergeSort {

    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode mid = middleNode(head);

        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return mergeTwoLists( left, right);
    }


    /* https://leetcode.com/problems/middle-of-the-linked-list/ */
    public ListNode middleNode(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while ((fast != null) && (fast.next !=null)){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    /* https://leetcode.com/problems/merge-two-sorted-lists/ */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode merged = new ListNode();
        ListNode tail = merged;

        while (list1 != null && list2 != null){

            if(list1.val <list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        tail.next = (list1 != null) ? list1 : list2;

        return merged.next;

    }




}
