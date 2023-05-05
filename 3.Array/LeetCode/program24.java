
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

        // int mr = mat.length;
        // int mc = mat[0].length;

        int mr=0;
        int mc=0;

        // System.out.println(mat[0].length);

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

                res[i][j] = mat[mr][mc];
                
                mc++;
                if(mc==mat[0].length){
                    mr++;
                    mc=0;
                }

                if(mr==mat.length){
                    break;
                }
            }
        }
        return res;
        
    }

    public static void main(String[] args) {
        
        int[][] nums= {{1,2},{3,4}};

        // System.out.println(nums.length);
        int r=1;
        int c=4;

        int[][] a = matrixReshape(nums, r, c);

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;i++){
                System.out.println(a[i][j]);
            }
        }
    }
    
}
