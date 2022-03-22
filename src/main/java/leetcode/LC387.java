package leetcode;

import java.util.*;

// First Unique Character in a String

/* If the index of first occurrence and last occurrence of the  character is same
*   then that is the single occurred element ... else return -1;
*   */

public class LC387 {

    public static void main(String[] args) {
        int r1 = firstUniqChar("leetcode");
        int r2 = firstUniqChar("loveleetcode");
        int r3 = firstUniqChar("aabb");

        System.out.println("" + r1);
        System.out.println("" + r2);
        System.out.println("" + r3);

    }

    public static int firstUniqChar(String s) {
        HashMap<Character,  Integer> hm = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);

            if(hm.get(c)!=null && hm.get(c)>0){
                hm.put(c, hm.get(c)+1);

            }
            else{
                hm.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){

            if(entry.getValue() == 1){
                return s.indexOf(entry.getKey());
            }
        }
        return -1;
    }

}
