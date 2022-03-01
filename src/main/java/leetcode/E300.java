package leetcode;

/*300. Longest Increasing Subsequence*/
public class E300 {

    public static void main(String[] args) {

        E300 e = new E300();
        int []nums = {20,5,4,12,25,40,35,50};
        int result = e.lengthOfLIS(nums);

        System.out.println(result);
    }

    public int lengthOfLIS(int[] nums) {

        int dp[] = new int[nums.length];

        int maxLength = 0;

        for(int i=0;i<nums.length;i++){
            dp[i]=1;

            for(int j=i-1; j>=0;j--){

                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }

            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }

}
