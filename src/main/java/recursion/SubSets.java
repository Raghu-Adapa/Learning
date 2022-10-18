package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {

        printSubsets("","abc");

        //2.
        List<String> subset = printSubsetsRet("","abc");
        System.out.println(subset);

        int[] arr = {1,2,3};
        List<List<Integer>> output = subsetIteration(arr);
        System.out.println(output);

        int[] arr1 = {1,2,2};
        List<List<Integer>> output1 = subsetIterationDuplicate(arr1);
        System.out.println(output1);


    }

    private static void printSubsets(String p, String up) {

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        // not take it
        printSubsets(p, up.substring(1));

        // take it
        printSubsets(p+up.charAt(0), up.substring(1));

    }

    private static List<String> printSubsetsRet(String p, String up) {

        if(up.isEmpty()){
            List<String> sub = new ArrayList<>();
            sub.add(p);
            return sub;
        }

        List<String> left = printSubsetsRet(p, up.substring(1));
        List<String> right = printSubsetsRet(p+up.charAt(0), up.substring(1));

        left.addAll(right);

        return left;

    }


    public static List<List<Integer>> subsetIteration(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr){


            int n= outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner = new ArrayList(outer.get(i));
                inner.add(num);
                outer.add(inner);

            }

        }


        return outer;

    }

    public static List<List<Integer>> subsetIterationDuplicate(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for (int i=0;i<arr.length;i++){

            start = 0;
            // if current and previous elements are same then s = e+1;
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }

            end = outer.size()-1;
            int n= outer.size();
            for(int j=start;j<n;j++){
                List<Integer> inner = new ArrayList(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);

            }

        }


        return outer;

    }



}
