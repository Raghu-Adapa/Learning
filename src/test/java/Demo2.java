public class Demo2 {

    public static void main(String[] args) {

        CustomList list = new CustomList(2);
        //ArrayList list = new ArrayList(2);

        list.add("Java");
        list.add("HTML");
        list.add("Spring");
        list.add("Oracle");

        for(String str : list.arr) {
            System.out.println(str);
        }
        list.remove("HTML");

        System.out.println("Element at index 2 is : "+list.get(2));
    }
}
