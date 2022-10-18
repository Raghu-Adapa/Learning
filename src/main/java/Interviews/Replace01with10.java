package Interviews;

public class Replace01with10 {

    public static void main(String[] args) {

        int result = paradeInHackerLand("001011");

        System.out.println(result);
    }

    private static int paradeInHackerLand(String s) {

        char arr[] = s.toCharArray();

        int count = 0;


        boolean isSorted = true;

        while (isSorted) {
            boolean changed = false;
            int i = 0;
            int j = 1;

            while (j < s.length()) {

                if (arr[i] == '0' && arr[j] == '1') {
                    arr[i] = '1';
                    arr[j] = '0';
                    i += 2;
                    j += 2;
                    changed = true;
                } else {
                    i++;
                    j++;
                }
            }
            if(changed){
                count++;
            }else {
                isSorted = false;
            }
        }

        return count;
    }
}
