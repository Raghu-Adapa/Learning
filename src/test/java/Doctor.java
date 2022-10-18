// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Doctor {

    public static void main(String[] args) {
        int[] A = {1,2,1,6,8,7,8};
        int[] B = {2,3,4,7,7,8,7};
        boolean ans = solution(A, B, 10);

        System.out.println(ans);
    }

    public static  boolean solution(int[] A, int[] B, int S) {
        // write your code in Java SE 8
        if(A.length>S){
            return false;
        }

        int[] res = new int[S];
        return solutionRec(A, B, S, res, 0);
    }

    public static boolean solutionRec(int[] A, int[] B, int S, int[] result, int slots) {

        slots++;

        if(slots == A.length){

            int count = 0;
            Set<Integer> s = new HashSet<>();
            for(int r : result){
                if(r!=0) count++;
                s.add(r);
            }
            if(count == A.length && s.size() == A.length){
                return true;
            }else{
                return false;
            }

            /*Set<Integer> s = new HashSet<>();
            for(int r : result){
                s.add(r);
            }
            if(s.size() == A.length){
                return true;
            }else{
                return false;
            }*/

        }

        result[A[slots-1]] = slots;
        boolean left = solutionRec(A, B, S, result, slots );

        result[B[slots-1]] = slots;
        boolean right = solutionRec(A, B, S, result, slots );

        return (left || right) ;

        //}
    }
}
