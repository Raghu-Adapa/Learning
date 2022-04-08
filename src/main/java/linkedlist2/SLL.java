package linkedlist2;

public class SLL {

    ListNode head;
    int size;

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public void insertLast(int value){

        ListNode newNode = new ListNode(value);

        if(head == null){
            head = newNode;
            size++;
            return;
        }

        ListNode current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
        size++;

    }

    public ListNode insertLast(ListNode head, int value){

        ListNode node = new ListNode(value);

        if(head == null){
            head = node;
            return head;
        }
        ListNode current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = node;

        return head;
    }


    // Print the list
    public void display(){
        ListNode current = head;

        while(current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }


    /* https://leetcode.com/problems/middle-of-the-linked-list/ */
    public ListNode middleNode(){

        ListNode slow = head;
        ListNode fast = head;

        while ((fast != null) && (fast.next !=null)){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /*  https://leetcode.com/problems/remove-duplicates-from-sorted-list/ */

    public ListNode deleteDuplicates() {

        ListNode current = head;
        if( current == null) return head;
        if( current.next == null) return head;

        ListNode temp = current.next;

        while (current!=null && temp != null){

            if(current.val != temp.val){
                current.next = temp;
                current = current.next;
            }
            temp = temp.next;
        }
        current.next = null;
        return head;
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


    /*  https://leetcode.com/problems/linked-list-cycle/  */
    public boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null && fast.next !=null){

            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public int cycleLength(ListNode head) {

        int count = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null && fast.next !=null){

            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                ListNode temp = slow;

                do{
                    count++;
                    temp = temp.next;
                }while (temp!=slow);
                return count;
            }
        }
        return count;
    }


    /*  https://leetcode.com/problems/linked-list-cycle-ii/ */
    public ListNode detectCycle(ListNode head) {

        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                ListNode temp = slow;
                do {
                    length++;
                    temp = temp.next;
                }while (temp != slow);
            }
            if(length > 0) break;
        }

        if(length == 0 ){
            return null;
        }

        ListNode s = head;
        ListNode f = head;

        while (length > 0){
            s= s.next;
            length--;
        }


        while (f != s){
            f = f.next;
            s = s.next;
        }

        return s;
    }

    private int digitSquareSum(int num){
        int sum = 0;
        while (num > 0){
            int rem = num%10;
            sum += rem*rem;
            num = num/10;
        }
        return sum;
    }

    /* https://leetcode.com/problems/happy-number/ */
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do{
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        }while (slow != fast );

        if(slow == 1) {
            return true;
        } else {
            return false;
        }
    }



    /*  https://leetcode.com/problems/reverse-linked-list/ */

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }



}
