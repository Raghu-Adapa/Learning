package Interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mattress {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Read Test Cases
        int T = sc.nextInt();
        for(int i=0;i<T;i++){

            int n = sc.nextInt();
            String[] start = new String[n];
            String[] end = new String[n];

            for(int j=0;j<n;j++){

                //String[] str = sc.nextLine().split(" ");
                start[j] = sc.next();
                end[j]= sc.next();
            }

            findMattress(start, end);
            /*if(n>0)
                System.out.println(mattressCount(arr));*/
        }

    }

    public static void findMattress(String[] start, String[] end){

        int arr[] = new int[start.length];
        int dep[] = new int[end.length];

        for (int i=0; i<start.length;i++) {
            //System.out.println(start[i] + " " + end[i]);
            String[] a = start[i].split(":");
            String[] d = end[i].split(":");
            int at = Integer.parseInt(a[0]) *60*60 + Integer.parseInt(a[1]) *60 + Integer.parseInt(a[2]);
            int dt = Integer.parseInt(d[0]) *60*60 + Integer.parseInt(d[1]) *60 + Integer.parseInt(d[2]);

            arr[i] = at;
            dep[i] = dt;

        }

/*        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(dep[i]+ " ");
        }*/

        //System.out.println("\n");

        Arrays.sort(arr);
        Arrays.sort(dep);

        /*for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(dep[i]+ " ");
        }*/

        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        int n= start.length;

        int duration = dep[0] - arr[0];

        Map<Integer, Integer> map = new HashMap<>();
        map.put(plat_needed, duration);

        // Similar to merge in merge sort to process
        // all events in sorted order
        while (i < n && j < n) {
            // If next event in sorted order is arrival,
            // increment count of platforms needed
            if (arr[i] <= dep[j]) {
                plat_needed++;
                int d = dep[j] - arr[i];
                map.put(plat_needed, map.getOrDefault(plat_needed, 0) + d);
                i++;
            }

            // Else decrement count of platforms needed
            else if (arr[i] > dep[j]) {
                plat_needed--;
                int d = arr[i] - dep[j];
                map.put(plat_needed, map.getOrDefault(plat_needed, 0) + d);
                j++;
            }

            // Update result if needed
            if (plat_needed > result)
                result = plat_needed;
        }

        int dur = map.get(result);
        String hours= (dur / 3600) <10 ? "0"+String.valueOf((dur / 3600)) : String.valueOf((dur / 3600));
        dur = dur % 3600;
        String min= (dur / 60) <10 ? "0"+String.valueOf((dur / 60)) : String.valueOf((dur / 60));
        dur = dur % 60;
        String sec= (dur) <10 ? "0"+String.valueOf((dur)) : String.valueOf((dur));

        System.out.println(result +" "+ hours+":"+min+":"+sec);
        //return result;


    }


}
