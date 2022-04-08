package linkedlist2;

public class Main {

    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(22);
        list.insertFirst(18);
        list.insertFirst(2);

        list.display();

        list.insertLast(3);
        list.display();

        list.insertAt(20, 2);
        list.display();
        list.insertAt(22, 1);
        list.display();

        int index = list.find(18);
        System.out.println("18 is found at "+ index);
        int index1 = list.find(3);
        System.out.println("3 is found at "+ index1);
        int index2 = list.find(22);
        System.out.println("22 is found at "+ index2);
        int index3 = list.find(25);
        System.out.println("18 is found at "+ index3);


        list.display();
        System.out.println(" DeleteFirst : "+ list.deleteFirst());
        list.display();

        int dindex = list.deleteLast();
        System.out.println("Deleted Last element "+dindex);

        /*Display list in reverse order !*/
        System.out.println("---- Display list in reverse order !----");
        list.displayReverse();
        System.out.println("Start ");
        list.display();

        System.out.println("Deleting the elements by its index");

        int d6 = list.deleteAt(6);
        System.out.println("Deleted index6 :" + d6);
        list.display();


        int d3 = list.deleteAt(3);
        System.out.println("Deleted index3 :" + d3);
        list.display();

        int d4= list.deleteAt(4);
        System.out.println("Deleted index4 :" + d4);
        list.display();

        int d0 = list.deleteAt(0);
        System.out.println("Deleted index0 :" + d0);
        list.display();


        int d2 = list.deleteAt(2);
        System.out.println("Deleted index2 :" + d2);
        list.display();

        int d20 = list.deleteAt(20);
        System.out.println("Deleted index20 :" + d20);
        list.display();

        /*LL list2 = new LL();

        System.out.println("Test Delete Last : ");
        System.out.println("deleted value ="+list2.deleteLast());
        list2.display();

        list2.insertFirst(10);
        System.out.println("deleted value ="+list2.deleteLast());
        list2.display();

        list2.insertFirst(10);
        list2.insertFirst(5);
        System.out.println("deleted value ="+list2.deleteLast());
        list2.display();

        list2.makeEmpty();

        list2.insertLast(10);
        list2.insertLast(5);
        list2.insertLast(18);
        System.out.println("deleted value ="+list2.deleteLast());
        list2.display();
*/



    }
}
