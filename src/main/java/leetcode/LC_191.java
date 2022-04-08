package leetcode;

public class LC_191 {

    public static void main(String[] args) {

        int i = 15;
        int res = hammingWeight(i);

        System.out.println(res);
    }

    public static int hammingWeight(int n) {

        int count = 0;
        while(n>0){

            if( (n & 1) == 1 ){
                count ++;
            }

            n = n>>>1;
        }
        return count;
    }
}
