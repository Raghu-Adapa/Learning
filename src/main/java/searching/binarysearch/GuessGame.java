package searching.binarysearch;

public class GuessGame {

    public static void main(String[] args) {

        int n = 300;
        System.out.println(guessNumber(n));

    }
    public static int guessNumber(int n) {

        int start = 1;
        int end = n;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(guess(mid) > 0){
                start = mid+1;
            }else if (guess(mid) < 0){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;

    }

    private static int guess(int num){
        int guessNum = 250;

        if(num == guessNum)
            return 0;
        else if (num > guessNum)
            return -1;
        else
            return 1;

    }
}
