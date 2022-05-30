package searching.binarysearch;

import java.util.Arrays;

public class MatrixRowColSorted {

    public static void main(String[] args) {

        // array is sorted row wise and column wise
        int[][] arr = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 5;
        int[] searchIndex = searchInMatrix(arr, target);
        System.out.println(Arrays.toString(searchIndex));
    }

    private static int[] searchInMatrix(int[][] matrix, int target){

        int row = 0;
        int col = matrix[0].length-1;

        while( row < matrix.length && col>=0) {
            if (target == matrix[row][col]) {
                return new int[]{row, col};
            }
            if (target < matrix[row][col]) {
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
