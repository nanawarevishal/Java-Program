
/*
 1351. Count Negative Numbers in a Sorted Matrix
            Easy
            3.3K
            92
            Companies
            Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

            

            Example 1:
            Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
            Output: 8
            Explanation: There are 8 negatives number in the matrix.

            Example 2:
            Input: grid = [[3,2],[1,0]]
            Output: 0

 */

package LeetCode;

public class program53 {

    static int countNegatives(int[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[i].length ; j++) {
                if (grid[i][j] < 0){
                   cnt += grid[i].length - j; 
                    break;
                }
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,2,-3}};

        System.out.println(countNegatives(grid));
    }
    
}
