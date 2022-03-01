package leetcode;

import java.util.HashMap;
import java.util.Map;

class targetSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int first = nums[i];

            int second = target - first;
            if( map.get(second) != null){
                return new int[]{i, map.get(second)};
            }else{
                map.put(first, i);
            }

        }
        return new int[]{-1};
    }
}