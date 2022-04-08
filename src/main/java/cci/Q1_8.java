package cci;

/*
Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0.
* */
public class Q1_8 {

    public static void main(String[] args) {

        Q1_8 q8 = new Q1_8();

        int[][] matrix = new int[][]{
                {1,2,3,4,5},
                {6,0,8,9,10},
                {11,12,13,14,15},
                {4,3,5,7,0}
        };

        q8.zeroMatrix(matrix);

    }
    public void zeroMatrix(int matrix[][]){

        int noRows = matrix.length;
        int noCol = matrix[0].length;

        int[] rows = new int[noRows];
        int[] cols = new int[noCol];

        int index =0, count=0;

        for(int i=0; i<noRows;i++){
            for(int j=0;j<noCol;j++){

                if(matrix[i][j] == 0){
                    rows[index] = i;
                    cols[index] = j;
                    index++; count++;
                }
            }
        }

        // print the Matrix
        printMatrix(matrix);

        for(int k=0;k<count;k++){
            for(int j=0;j<noCol;j++){
                matrix[rows[k]][j] = 0;
            }
            for(int i=0;i<noRows;i++){
                matrix[i][cols[k]] = 0;
            }
        }

        // print Matrix
        printMatrix(matrix);

    }

    public void printMatrix(int matrix[][]){

        System.out.println("--------- Print Matrix ------------");

        int noRows = matrix.length;
        int noCol = matrix[0].length;

        for(int i=0; i<noRows;i++){
            for(int j=0;j<noCol;j++){

                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
    }

}


