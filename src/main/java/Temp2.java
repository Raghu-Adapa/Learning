import java.util.Scanner;

public class Temp2 {

    public static void main(String[] args) {

        int a = 100;
        int b = 20;
        int c = 25;

        if(a==b && a==c){
            System.out.println("all are same"+ a);
        }else if(a==b && a>c){
            System.out.println("A B = "+ a);
        }else if(a==c && a>b){
            System.out.println("A C = "+ a);
        }else if(b==c && b>a){
            System.out.println("B C = "+ b);
        }
        else{
            if(a>b && a>c){
                System.out.println("a :"+ a);
            }else {
                if (b > c) {
                    System.out.println("b :" + b);
                } else {
                    System.out.println("c :" + c);
                }
            }
        }
    }
}
