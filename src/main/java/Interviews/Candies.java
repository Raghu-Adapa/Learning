package Interviews;

import java.util.Scanner;

public class Candies {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Read Test Cases
        int T = sc.nextInt();
        for(int i=0;i<T;i++){

            int n = sc.nextInt();

            int c1 = sc.nextInt();
            int c2 = sc.nextInt();


            System.out.println(findMinMoney(n, c1, c2));

        }

    }

    public static int findMinMoney(int n, int c1, int c2){

        if(n <= 0 || c1<=0 || c2 <=0){
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for(int k=0; k<=n; k++){

            int l = n-k;

            int cost = (c1* (int) Math.pow(k,2)) + (c2* (int) Math.pow(l,2));

            if(cost <= min)
                min = cost;

        }
        return min;


    }


}
