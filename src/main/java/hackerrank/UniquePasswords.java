package hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePasswords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            String str = scanner.next();
            arr[i] = str;
        }

       int result = getUniquePasswordsCount(n, arr);
        System.out.println(result);
    }

    private static int getUniquePasswordsCount(int n, String[] arr) {

        Set<String> set= new HashSet<String>();

        for(int i=0;i<n;i++){

            char[] ch = arr[i].toCharArray();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int j=0;j<ch.length;j++){
                if(j%2==0){
                    even.append(ch[j]);
                }else{
                    odd.append(ch[j]);
                }
            }

            String evenSorted = sortString(even);
            String oddSorted = sortString(odd);

            set.add(evenSorted+":"+oddSorted);

        }
        return set.size();
    }

    private static String sortString(StringBuilder sb) {
        char[] chArray = sb.toString().toCharArray();
        Arrays.sort(chArray);
        return String.valueOf(chArray);
    }
}
