package searching.binarysearch;

public class FirstBadVersion {

    public static void main(String[] args) {
        int result  = firstBadVersion(5);
        System.out.println(result);
    }

    private static boolean isBadVersion(int version){
        boolean[] versions = new boolean[]{true,true, true, false, false};

        return !versions[version-1];
    }

    public static int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        int firstBadVersion = n;

        while (start<=end){
            int mid = start + (end - start)/2;

            if(isBadVersion(mid)){
                firstBadVersion = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return firstBadVersion;

    }
}
