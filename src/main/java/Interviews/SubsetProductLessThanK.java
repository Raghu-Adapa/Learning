package Interviews;

import java.util.*;

public class SubsetProductLessThanK {

    public static void main(String args[]){

        int[] arr = {2,4,5,3};

        int res = countOfSubsetLessthanK(arr, 12);

        System.out.println(res);

        //generateSubsets(arr);

    }

    private static int countOfSubsetLessthanK(int[] arr, int k) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                continue;
            }
            if(i < (arr.length/2)){
                l1.add(arr[i]);
            }else{
                l2.add(arr[i]);
            }
        }

        int[] p1 = generateSubsets(l1);
        int[] p2 = generateSubsets(l2);


        Arrays.sort(p1);
        Arrays.sort(p2);

        int count = 0;
        for(int i=0;i<p1.length;i++){

            int searchIndex = binarySearch(p2, k/p1[i]);
            count = count + searchIndex;

        }

        return count-1;
    }

    public static int binarySearch(int[] nums, int search){

        int start = 0;
        int end = nums.length-1;

        while (start<=end){

            int mid = start + (end - start)/2 ;

            if(nums[mid] > search){
                end = mid-1;
            }else if(nums[mid] < search){
                start = mid + 1;
            }else {
                return mid+1;
            }


        }

        return end+1;

    }

    public static int[] generateSubsets(List<Integer> arr){


        int n = 1<< arr.size();
        //List<Integer> products = new ArrayList<>();
        int[] res = new int[n];
        for(int i=0; i < n; i++){
            //System.out.print(i+" = ");

            int index = 0;
            int product = 1;
            for(int k=i; k>0 ; k= k>>1){
                if((k&1) ==1){
                    product = product * (arr.get(index));
                }
                index++;
            }
            res[i] = product;
        }

        return res;

    }
}
