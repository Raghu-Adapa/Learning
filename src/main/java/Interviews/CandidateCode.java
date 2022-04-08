package Interviews;

import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        //Write code here
        Scanner sc = new Scanner(System.in);
        // Read Test Cases
        int T = sc.nextInt();
        for(int i=0;i<T;i++){

            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            if(n>0)
            System.out.println(countDuplicates(arr));
        }

    }

    private static int countDuplicates(int arr[]){

        int count = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value > 1){
                count += (value * (value - 1));
            }
        }

        return count;

    }
}
