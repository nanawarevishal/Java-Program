
/*

 566. Reshape the Matrix
            Easy
            3.2K
            373
            Companies
            In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

            You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

            The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

            If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

            

            Example 1:
            Input: mat = [[1,2],[3,4]], r = 1, c = 4
            Output: [[1,2,3,4]]

            Example 2:
            Input: mat = [[1,2],[3,4]], r = 2, c = 4
            Output: [[1,2],[3,4]]

 */


package LeetCode;

public class program24 {

    static int[][] matrixReshape(int[][] mat, int r, int c) {

        int res[][] = new int[r][c];
        
        int mr=0;
        int mc=0;

        boolean falg = false;
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               res[mr][mc] = mat[i][j];

               mc++;
               if(mc==c){
                mr++;
                mc=0;
               }

               if(mr==r){
                falg = true;
                break;
               }
            }
            if(falg){
                break;
            }
        }
        return res;
        
    }

    public static void main(String[] args) {
        
        int[][] nums= {{1,2},{3,4}};

        // System.out.println(nums.length);
        int r=2;
        int c=2;

        int[][] a = matrixReshape(nums, r, c);

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
        }
    }
    
}
