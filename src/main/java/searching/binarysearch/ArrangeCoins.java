package searching.binarysearch;

//https://leetcode.com/problems/arranging-coins/
public class ArrangeCoins {

    public static void main(String[] args) {
        int reslut = arrangeCoints(1804289383);
        System.out.println(reslut);
    }

    private static int arrangeCoints(int n) {

        long start = 0;
        long end = n;

        while (start <= end){

            long mid = start + (end-start)/2;
            long sum = (mid) * (mid+1)/2;

            if(sum == n){
                return (int)mid;
            }
            else if(sum > n){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return (int)end;
    }
}
