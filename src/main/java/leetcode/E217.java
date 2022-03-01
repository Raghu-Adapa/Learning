package leetcode;

import java.util.HashSet;
import java.util.Set;

/*Contains Duplicate*/
public class E217 {

    public static void main(String[] args) {
        E217 e = new E217();
        int[] n  = new int[]{1,2,3,4};
        e.containsDuplicate(n);
    }
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> hashSet = new HashSet<>();

        for(int n : nums){
            if(hashSet.contains(n)){
                return true;
            }else {
                hashSet.add(n);
            }

        }
        return false;
    }

}
