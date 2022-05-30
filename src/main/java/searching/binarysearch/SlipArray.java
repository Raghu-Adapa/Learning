package searching.binarysearch;

public class SlipArray {

    public static void main(String[] args) {

        int[] arr = {7,2,5,10,8};
        int max = splitArray(arr, 2);
        System.out.println(max);
    }

    public static int splitArray(int[] nums, int m) {

        int start = 0;
        int end = 0;

        for(int i=0;i<nums.length;i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while (start<end){

            int mid = start + (end - start)/2;
            int sum = 0;
            int partitions = 1;

            for(int num: nums){

                if( sum + num > mid){
                    sum = num;
                    partitions++;
                }else{
                    sum= sum+num;
                }
            }

            if(partitions > m){
                start = mid+1;

            }else{
                end = mid;
            }
        }
        return end;

    }
}
