package searching.binarysearch;

public class FindMinRotatedSort {

    public static void main(String[] args) {

        int[] arr = {20,25,1,2,4,5,6,7,9,10,15};

        int pivot = findMin(arr);

        System.out.println(pivot);

        //int[] nums = {2,2,2,0,1};
        int[] nums = {1,3,5};

        System.out.println("nums = "+ findPivotWithDuplicates(nums));
    }


    public static int findMin(int[] nums) {

        int pivot = findPivot(nums);

        return nums[pivot+1];
    }

    public static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        while (start<end){
            int mid = start+ (end - start)/2;

            if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(start<mid && nums[mid]<nums[mid-1]){
                return mid-1;
            }

            if(nums[start] <= nums[mid] ){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;

    }

    private static int findPivotWithDuplicates(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        while (start < end){
            int mid = start + (end - start)/2;

            if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            // if elements at start, mid, end are samer, just skip the duplicates

            if ((nums[start] == nums[mid]) && (nums[end] == nums[mid]))
            {
                // check whether start or end are pivit before skipping
                if(nums[start] > nums[start+1])
                    return start;
                start++;

                if(nums[end] < nums[end-1])
                    return end-1;
                end--;
            }else if(nums[start] < nums[mid]  || (nums[start] == nums[mid] && nums[mid]>nums[end])){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

}
