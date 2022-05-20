package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Channel {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(2);
        l.add(2);
        l.add(1);
        l.add(5);
        l.add(3);

    }


    public static void maximumQuality(List<Integer> packets, int channels) {
        // Write your code here
        int n= packets.size();
        int arr[]= new int[n];
        for (int i=0;i<n;i++){
            arr[i] = packets.get(i);
        }
        Arrays.sort(arr);

       // Comparable<Integer> comp = (n) -> {};

    }
}