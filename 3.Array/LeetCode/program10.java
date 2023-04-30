
/*
 48. Rotate Image
        Medium
        14.4K
        641
        Companies
        You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

        You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

        

        Example 1:
        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        Output: [[7,4,1],[8,5,2],[9,6,3]]


        Example 2:
        Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
        Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 */


package LeetCode;

public class program10 {

   static void rotate1(int[][] matrix) {

        int[][] res = new int[matrix.length][matrix.length];
        int x = matrix.length-1;
        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix.length;j++){

                res[j][x] = matrix[i][j];
            }
            x--;
        }

        for(int i=0;i<res.length;i++){

            for(int j=0;j<res.length;j++){

                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    static void rotate(int[][] matrix){
        
        //For transpose of matrix
        for(int i=0;i<matrix.length;i++){

            for(int j=i+1;j<matrix.length;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Reverse the columns

        for(int i=0;i<matrix.length;i++){

            int left = 0;
            int right = matrix.length-1;

            while(left <right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix.length;j++){

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        rotate1(matrix);

        rotate(matrix);
        
    }
}
