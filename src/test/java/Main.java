import java.util.*;

class Main {

    public void testing(Object o){
        System.out.println("Object method called !");
    }

/*    public void testing(String str){
        System.out.println("String method called !");
    }*/

    public static void main(String[] args) {

        /*String sub = "my name is Raghu".substring(5,4);
        System.out.println("Sub = "+sub);
*/
        Character c = 97;
        int i = 97;
        String x = new String(new char[2]);
        String x1 = new String(new byte[3]);

        System.out.println(x1.substring(1));

        System.out.println("x ="+ x);
        System.out.println("length = "+ x.length());

        System.out.println("x1 ="+ x1);
        System.out.println("length = "+ x1.length());

        Main m = new Main();
        /*m.testing(null);



        Student s = new Student(24);
        System.out.println(s);*/
        System.out.println(5);

        /*int N= 20;

        int[] arr = new int[20];

        arr[0] = 8;
        arr[1] = 10;
        arr[2] = 18;
        arr[3] = 36;
        arr[4] = 64;

        int p=4;
        for(int i = 5 ; i<N;i++){

            int prev = arr[i-1];

            arr[i] = prev + ((int)Math.pow(2,p) +1 );
            p++;

        }

        for(int i = 0 ; i<N;i++){

            System.out.println(i +" -> " + arr[i]);

        }*/
    }
}