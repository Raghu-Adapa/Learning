package cci;

/*

URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
        has sufficient space at the end to hold the additional characters, and that you are given the "true"
        length of the string. (Note: If implementing in Java, please use a character array so that you can
        perform this operation in place.)
        EXAMPLE
        Input: "Mr John Smith ", 13
        Output: "Mr%20John%20Smith"


 */

/*
    -- solution
        1. count the spaces first,
            replace spaces with %20 ... iterate end to start while replacing
            so that no bother about overriding characters.
*/
public class Q1_3 {
    public static void main(String[] args) {

        Q1_3 q3 = new Q1_3();

        String str = "raghu adapa is good         ";

        String res = q3.URLify(str, 19);

        System.out.println(res);
    }

    public String URLify(String s, int size){

        char[] chars = s.toCharArray();

        int spaces =0;
        for(int i=0;i<size;i++){
            if(chars[i] == ' '){
                spaces++;
            }
        }
        int index = size + (spaces*2);
        System.out.println("index "+ index);

        for(int i=size-1; i>=0; i--){

            if(chars[i] == ' '){

                chars[index-3] = '%';
                chars[index-2] = '2';
                chars[index-1] = '0';

                index = index - 3;

            }else{
                chars[index-1] = chars[i];
                index = index-1;
            }
        }

        return new String(chars);

    }
}
