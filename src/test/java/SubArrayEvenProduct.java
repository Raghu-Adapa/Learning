

import java.io.*;
import java.util.*;


public class SubArrayEvenProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_Arr = br.readLine().split(" ");
            int[] Arr = new int[N];
            for(int i_Arr = 0; i_Arr < arr_Arr.length; i_Arr++)
            {
                Arr[i_Arr] = Integer.parseInt(arr_Arr[i_Arr]);
            }

            int out_ = Solve(N, Arr);
            System.out.println(out_);

        }

        wr.close();
        br.close();

        /*int N = 5;
        int[] arr = {5,2,3,1,7};

        System.out.println(Solve(5, arr));*/
    }
    private static int Solve(int N, int[] Arr){
        // Return the answer
        int result = 0;

        if(Arr.length==1){
            if(Arr[0]%2==0){
                return 1;
            }else{
                return result;
            }
        }

        int sum = Arr[0];
        int count = 1;
        for(int i=1;i<Arr.length;i++){

            sum = sum*Arr[i];

            if((sum%2) == 0 && (Arr[i-1]%2 == 0 || Arr[i]%2==0)){
                count += 1;
            }else{

                if(count > result){
                    result = count;
                }
                sum = Arr[i];
                count = 1;
            }

        }
        if(count > result){
            result = count;
        }

        return result;

    }
}