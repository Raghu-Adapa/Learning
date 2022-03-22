package cci;

/*
* Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
*
* */

/* -- Solution:

    0. Brute force, take the character and compare with remaining
        TC - (N^2)
        space - O(1)

    1. take the character count and check any character frequency is greater than 1 -
        TC - O(N)
        space - O(N)

    2. for unique character, first occurrence index and last occurrence index will be same
        TC - O(N)
        spance - O(1)

*/

public class Q1_1 {
    public static void main(String[] args) {

        Q1_1 obj = new Q1_1();
        String str = "hellow";
        System.out.println(obj.isUnique(str));
    }


    // third approach
    public boolean isUnique(String str){

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            if(str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))){
                return false;
            }
        }
        return true;

    }
}
