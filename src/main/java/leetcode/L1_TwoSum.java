package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/two-sum/

*/
class L1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(target - nums[i])){

                result[1] = i;
                result[0] = map.get(target - nums[i]);
            }else{
                map.put(nums[i], i);
            }
        }
        return result;

    }

    public static void main(String[] args) {

        int[] case1 = twoSum( new int[]{2,7,11,15} , 9);
        System.out.println("( "+case1[0] +", "+ case1[1]+" )");

        int[] case2 = twoSum( new int[]{3,2,4} , 6);
        System.out.println("( "+case2[0] +", "+ case2[1]+" )");

        int[] case3 = twoSum( new int[]{3,3} , 6);
        System.out.println("( "+case3[0] +", "+ case3[1]+" )");


    }
}
