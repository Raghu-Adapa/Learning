package Interviews;

import java.util.Stack;

public class NextGreaterElementInArray {

    public static void main(String[] args) {

        int[] arr = {13, 7, 6, 12, 10};

        int[] result = nextGreaterElement(arr);

        for(int element :result){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int[] nextGreaterElement(int[] arr){

        int[] result = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<arr.length;i++){

            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }

            if(arr[stack.peek()] >= arr[i]){
                stack.push(i);
            }else{
                result[stack.pop()] = arr[i];
                i--;
            }
        }
        while (!stack.isEmpty()){
            result[stack.pop()]=-1;
        }

        return result;
    }

    public static long[] solveNextLargerElement(long[] arr,int n){
        long[] ans  = new long[n];

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i< n;i++){
            if(stack.size()==0){
                stack.push(i);
                continue;
            }

            while(stack.size()>0 && arr[i] > arr[stack.peek()]){
                ans[stack.pop()]= arr[i];
            }

            stack.push(i);



        }

        while(stack.size()>0){
            ans[stack.pop()]=-1;
        }

        return ans;
    }


}
