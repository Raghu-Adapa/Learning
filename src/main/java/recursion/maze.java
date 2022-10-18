package recursion;

import java.util.ArrayList;
import java.util.List;

public class maze {

    public static void main(String[] args) {

        maze("", 3,3);

        System.out.println("count : "+ mazePossiblePathsCount("", 3,3));

        System.out.println(mazeReturn("", 3, 3));

        System.out.println("Diagonal paths list : "+ mazeReturnDiagonal("", 3,3));

        System.out.println("Diagonal paths count : "+ mazeReturnDiagonalCount("", 3,3));

        boolean[][] matrix = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        System.out.println("Blocked middle : "+ mazeReturnBlock("", 0, 0, matrix));

    }

    private static void maze(String p, int r, int c){

        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            maze(p+"D", r-1, c);
        }
        if(c>1){
            maze(p+"R", r, c-1);
        }

    }

    private static int mazePossiblePathsCount(String p, int r, int c){

        if(r==1 && c==1){
            return 1;
        }

        int count = 0;
        if(r>1){
            count = count + mazePossiblePathsCount(p+"D", r-1, c);
        }
        if(c>1){
            count = count + mazePossiblePathsCount(p+"R", r, c-1);
        }
        return count;
    }

    private static List<String> mazeReturn(String p, int r, int c){

        if(r==1 && c==1){
            List<String> newOne = new ArrayList<>();
            newOne.add(p);
            return newOne;
        }

        List<String> result = new ArrayList<>();

        if(r>1){
            result.addAll(mazeReturn(p+"D", r-1, c));
        }

        if(c>1){
            result.addAll(mazeReturn(p+"R", r, c-1));
        }

        return result;
    }

    private static List<String> mazeReturnDiagonal(String p, int r, int c){

        if(r==1 && c==1){
            List<String> newOne = new ArrayList<>();
            newOne.add(p);
            return newOne;
        }

        List<String> result = new ArrayList<>();

        if(r>1 && c>1){
            result.addAll(mazeReturnDiagonal(p+"D", r-1, c-1));
        }

        if(r>1){
            result.addAll(mazeReturnDiagonal(p+"V", r-1, c));
        }

        if(c>1){
            result.addAll(mazeReturnDiagonal(p+"H", r, c-1));
        }

        return result;
    }

    private static int mazeReturnDiagonalCount(String p, int r, int c){

        if(r==1 && c==1){

            return 1;
        }

        int count =0;

        if(r>1 && c>1){
            count = count + mazeReturnDiagonalCount(p+"D", r-1, c-1);
        }

        if(r>1){
            count = count + (mazeReturnDiagonalCount(p+"V", r-1, c));
        }

        if(c>1){
            count = count + (mazeReturnDiagonalCount(p+"H", r, c-1));
        }

        return count;
    }

    private static List<String> mazeReturnBlock(String p, int r, int c, boolean[][] matrix){

        if(r==matrix.length-1 && c==matrix[0].length-1){

            List<String> newOne = new ArrayList<>();
            newOne.add(p);
            return newOne;
        }

        List<String> result = new ArrayList<>();

        if(r<matrix.length && c<matrix[0].length && matrix[r][c]==false){
            return new ArrayList<>();
        }



        if(r<matrix.length ){
            result.addAll(mazeReturnBlock(p+"V", r+1, c, matrix));
        }

        if(c<matrix[0].length){
            result.addAll(mazeReturnBlock(p+"H", r, c+1, matrix));
        }

        return result;
    }




}
