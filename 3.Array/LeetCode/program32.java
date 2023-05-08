
/*
 766. Toeplitz Matrix
            Easy
            3.3K
            155
            Companies
            Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

            A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.

            

            Example 1:
            Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
            Output: true
            Explanation:
            In the above grid, the diagonals are:
            "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
            In each diagonal all elements are the same, so the answer is True.

            Example 2:
            Input: matrix = [[1,2],[2,2]]
            Output: false
            Explanation:
            The diagonal "[1, 2]" has different elements.
 */



package LeetCode;

public class program32 {
    static boolean isToeplitzMatrix(int[][] matrix) {

        boolean flag = false;

        System.out.println(matrix[0].length);
        System.out.println(matrix.length);

        if(matrix.length==1 || matrix[0].length==1){
            return true;
        }

        else{

            for(int i=0;i<matrix.length-1;i++){

                for(int j=0;j<matrix[i].length-1;j++){

                    if(matrix[i][j] != matrix[i+1][j+1])
                    {
                        return false;
                    }

                    else{
                        System.out.println(matrix[i][j]);
                        flag = true;
                    }
                }
            
                // if(matrix[i][i]!=matrix[i+1][i+1]){
                //     flag = false;
                //     return false;
                // }
    
                // else{
                //     System.out.println("he");
                //     flag = true;
                // }
            }
        } 
        return flag;
        
    }

    public static void main(String[] args) {
        int matrix[][] = {{18},{66}};
        // [11,74,0,93],[40,11,74,7]

        System.out.println(isToeplitzMatrix(matrix));
    }
    
}
