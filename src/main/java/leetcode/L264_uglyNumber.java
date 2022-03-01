package leetcode;

public class L264_uglyNumber {

    public static void main(String[] args) {

        int result = nthUglyNumber(150);
        System.out.println(result);
    }

    private static int nthUglyNumber(int n) {

        int[] ugly = new int[n];
        ugly[0]=1;

        int i2=0;
        int i3=0;
        int i5=0;

        int nxt2= 2, nxt3= 3, nxt5= 5;

        int nxt = 1 ;

        for(int i=1;i<n;i++){

            nxt = Math.min(Math.min(nxt2, nxt3), nxt5);

            ugly[i] = nxt;
            if(nxt == nxt2){
                i2 +=1;
                nxt2 = ugly[i2] * 2;

            }if(nxt == nxt3){
                i3 +=1;
                nxt3 = ugly[i3] * 3;

            }if(nxt == nxt5){
                i5 +=1;
                nxt5 = ugly[i5] * 5;
            }
            //System.out.println(nxt);
        }

        return nxt;
    }
}
