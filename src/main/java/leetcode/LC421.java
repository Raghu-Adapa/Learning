package leetcode;

public class LC421 {

    public static void main(String[] args) {

        LC421 l = new LC421();

        //int nums[] = {3,10,5,25,2,8};
        int nums[] = {14,70,53,83,49,91,36,80,92,51,66,70};

        int result = l.findMaximumXOR(nums);

        System.out.println(result);

    }

    public int findMaximumXOR(int[] nums) {

        int max = 0;
        int start = (int) System.currentTimeMillis();

        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){

                int x = nums[i] ^ nums[j];

                max= (x>max) ? x : max;

            }
        }

        int end = (int) System.currentTimeMillis();
        System.out.println("Execution time"+(end-start));
        return max;
    }
}
