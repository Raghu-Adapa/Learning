package searching.linear;

public class SearchElement {



    public static void main(String[] args) {

        int[] arr = new int[10];

        for(int i= arr.length-1;i>0;i--){

            arr[i] = i+1;
        }

        System.out.println(""+linearSearch(arr,5));

    }

    private static int linearSearch(int[] arr, int k) {

        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    // find character in String

    // search in range

    // find min and max in array

    // search in 2D array
}
