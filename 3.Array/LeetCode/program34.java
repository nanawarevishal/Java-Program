
/*
 74. Search a 2D Matrix
            Medium
            12.1K
            344
            Companies
            You are given an m x n integer matrix matrix with the following two properties:

            Each row is sorted in non-decreasing order.
            The first integer of each row is greater than the last integer of the previous row.
            Given an integer target, return true if target is in matrix or false otherwise.

            You must write a solution in O(log(m * n)) time complexity.

        
            Example 1:
            Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
            Output: true

            Example 2:
            Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
            Output: false
 */


package LeetCode;


public class program34 {

    static boolean searchMatrix(int[][] matrix, int target) {

        boolean flag = false;

        int row = matrix.length;
        int col = matrix[row].length;

        for(int i=0;i<row;i++){
            if(matrix[row][col] >target){

                while(col>=0){
                    if(matrix[row][col]==target){
                        return true;
                    }
    
                    col--;
                }
            }
            else{
                
            }
        }
        


        return flag;
        
    }
    public static void main(String[] args) {

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int target =3;

        System.out.println(searchMatrix(matrix, target));
        
    }
}
