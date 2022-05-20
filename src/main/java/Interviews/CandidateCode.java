package Interviews;

import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        //Write code here
        Scanner sc = new Scanner(System.in);
        // Read Test Cases
        int T = sc.nextInt();
        for(int i=0;i<T;i++){

            int k = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            sumofK(k,arr);
        }

    }

    private static void sumofK(int k, int arr[]){

        int count = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();


        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1; j<arr.length;j++){

                if(arr[i] + arr[j] == k){
                    System.out.println((i+1) + " "+ (j+1));
                    break;
                }
            }
        }


    }
}
