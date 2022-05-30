package searching.binarysearch;

import java.util.Arrays;

//https://leetcode.com/problems/search-a-2d-matrix/submissions/
public class MatrixFullySorted {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10,11,16,20},
                {23,30,34,60},
                {71,73,75,77},
                {82,84,86,88}
        };

        int[][] matrix2 = new int[][]{
                {1},
                {3}
        };
        int target = 0;

        int[] index = searchMatrix(matrix2, target);
        System.out.println(Arrays.toString(index));
    }

    public static  int[] searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        while (rStart < (rEnd-1)){
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        // now we have 2 rows

        //check whether middle 2 elements contains the ans

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }

        // find target in 4 halves

        // 1. search in 1st half
        if(cMid>0 && target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // 2. search in 2nd half
        if(cMid <= cols-2 && target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);
        }
        // 3. search in 3rd half
        if(cMid>0 && target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        // 4. search in 4th half
        else{
            return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
        }

        //return new int[]{-1,-1};


    }

    private static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target ) {

        while(cStart<= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(target == matrix[row][mid]){
                return new int[]{row, mid};
            }
            if(target < matrix[row][mid]){
                cEnd = mid-1;
            }else{
                cStart = mid+1;
            }
        }

        return new int[]{-1,-1};
    }
}
