package Interviews;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateSubsets {

    public static void main(String args[]){

        int[] arr = {1,2,3,4};

        //generateSubsets(arr);

        List<List<Integer>> result = subsets2(arr);

        result.forEach(sl -> System.out.println(sl.toString()));

    }

    public static void generateSubsets(int[] arr){

        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
        }

        List<Set<Integer>> result = new ArrayList<>();
        for(int i=0; i < (1 << arr.length); i++){
            //System.out.print(i+" = ");

            int index = 0;
            Set<Integer> set = new HashSet<>();
            for(int k=i; k>0 ; k= k>>1){
                if((k&1) ==1){
                    set.add(arr[index]);
                }
                index++;
            }
            result.add(set);
        }

        for(Set<Integer> s : result){

            System.out.println(s.toString());
        }
        //result.forEach(s -> s.toString());


    }

    public static List<List<Integer>> subsets2(int[] nums) {

        int max = 1<<nums.length;

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0 ; i<max;i++){

            List<Integer> subList =new ArrayList<>();

            for(int b=0;b<nums.length;b++){

                int bit = (1<<b) ; // 1,2,4,8,16,12 ( only one bit is 1 and remaining are zeros)
                                            // so when we do & with this num it should return
                                            // same num or Zero(if bit is not set)
                if( (bit & i ) == bit){
                    subList.add(nums[b]);
                }

            }
            list.add(subList);
        }
        return list;
    }
}
