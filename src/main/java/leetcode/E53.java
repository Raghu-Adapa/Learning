package leetcode;

/*53. Maximum Subarray*/
/* Kadane's algm */
/* Dynamic programming */
public class E53 {

    public static void main(String[] args) {

        E53 e = new E53();

        int[] n = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(e.maxSubArray(n));

    }

    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxi = nums[0];

        for(int n : nums){

            sum += n;
            maxi = Math.max(sum, maxi);
            if(sum<0){
                sum = 0;
            }
        }
        return maxi;
    }
}
