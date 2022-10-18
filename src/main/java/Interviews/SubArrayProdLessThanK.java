package Interviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/subarray-product-less-than-k/
public class SubArrayProdLessThanK {

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 6};
        int k = 100;

        int result = numSubarrayProductLessThanK(arr, k);
        System.out.println(result);

        listSubarrayProductLessThanK(arr, k);

        // https://www.youtube.com/watch?v=SxtxCSfSGlo
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k<=1) return 0;

        int count = 0;
        int prod = 1;

        int left = 0;
        int right = 0;

        while (right<nums.length){

            prod = prod* nums[right];

            while (prod>=k){
                prod = prod/nums[left];
                left++;
            }
            if(prod<k){
                count = count + (right-left+1);
                right++;
            }

        }

        return count;


    }

    public static void listSubarrayProductLessThanK(int[] nums, int k) {

        if(k<=1) return;

        int count = 0;
        int prod = 1;

        int left = 0;
        int right = 0;


        List<List<Integer>> list = new ArrayList<>();

        while (right<nums.length){

            prod = prod* nums[right];

            while (prod>=k){
                prod = prod/nums[left];
                left++;
            }
            if(prod<k){

                printSubArray(nums, left, right, list);

                count = count + (right-left+1);
                right++;
            }

        }

        System.out.println(" total count = "+ count);

        list.forEach(sl -> {
            Collections.reverse(sl);
            System.out.println(sl.toString());
        });
    }

    public static void printSubArray(int[] nums, int left, int right, List<List<Integer>> result){

        List<Integer> slist = new ArrayList<>();
        for(int x = right; x>=left;x--){
            slist.add(nums[x]);

            List<Integer> add = new ArrayList<>();
            add.addAll(slist);

            result.add(add);
        }
    }
}
