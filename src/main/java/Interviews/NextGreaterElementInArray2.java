package Interviews;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementInArray2 {

    public static void main(String[] args) {

        int[] nums1 = {2,4};
        int[] arr = {1,2,3,4};

        int[] result = nextGreaterElement(nums1, arr);

        for(int element :result){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums2) {
            while(!st.isEmpty() && num > st.peek()) {
                map.put(st.pop(), num);
            }
            st.add(num);
        }
        int i = 0;
        for(int num : nums1) {
            ans[i ++] = map.getOrDefault(num, - 1);
        }
        return ans;

    }


    
}
