package searching.binarysearch;

//https://leetcode.com/problems/sum-of-square-numbers/
public class SquareSum {

    public static void main(String[] args) {

        System.out.println(judgeSquareSum(125));
    }

    // return true if N is equals to a^2 + b^2 for any a and b values
    public static boolean judgeSquareSum(int n) {
        int root = (int) Math.sqrt(n);
        long low = 0;
        long high = root;

        while(low<=high){
            long sum = (low*low)+(high*high);
            if(sum==n){
                return true;
            }
            if(sum>n){
                high--;
            }
            else{
                low++;
            }
        }

        return false;
    }
}
