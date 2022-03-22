package cci;

/*
* Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other.
* */

/*
    -- Solution
    1. Take the character count for two strings and compare .... if they are equal, then they are permutation
        to each other
            TC - O(N)
            spance - O(N)
            space - O(1) if we use constants like int[128];
     2. Sort the two strings and compare -
            TC - O(N logN)
            spacer O(1) - but most of the sorting algms takes extra space


 */
public class Q1_2 {

    public static void main(String[] args) {

        Q1_2 q2 = new Q1_2();

        boolean result = q2.isPermutation("raghu adapa", "aadpa raghu");

        System.out.println(result);

    }

    public boolean isPermutation(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        // assuming ASCII charset
        int[] counts = new int[128];

        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);
            counts[ch] += 1;
        }

        for(int j=0;j<t.length();j++){
            int ch1 = t.charAt(j);
            counts[ch1] = counts[ch1] - 1;
            if(counts[ch1] < 0){
                return false;
            }
        }

        return true;
    }
}
