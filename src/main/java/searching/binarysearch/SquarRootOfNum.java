package searching.binarysearch;

public class SquarRootOfNum {

    public static void main(String[] args) {

        int result = mySqrt(2147395599);
        System.out.println(result);
    }

    public static int mySqrt(int x) {

        long start = 0;
        long end = x;

        while(start<=end){
            long mid = start+ (end - start)/2;

            long currValue = mid*mid;
            if(currValue == x){
                return (int)mid;
            }
            if(currValue > x){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return (int) end;

    }
}
