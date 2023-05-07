
/*
 2658. Maximum Number of Fish in a Grid
            Medium
            196
            13
            Companies
            You are given a 0-indexed 2D matrix grid of size m x n, where (r, c) represents:

            A land cell if grid[r][c] = 0, or
            A water cell containing grid[r][c] fish, if grid[r][c] > 0.
            A fisher can start at any water cell (r, c) and can do the following operations any number of times:

            Catch all the fish at cell (r, c), or
            Move to any adjacent water cell.
            Return the maximum number of fish the fisher can catch if he chooses his starting cell optimally, or 0 if no water cell exists.

            An adjacent cell of the cell (r, c), is one of the cells (r, c + 1), (r, c - 1), (r + 1, c) or (r - 1, c) if it exists.

            

            Example 1:
            Input: grid = [[0,2,1,0],[4,0,0,3],[1,0,0,4],[0,3,2,0]]
            Output: 7
            Explanation: The fisher can start at cell (1,3) and collect 3 fish, then move to cell (2,3) and collect 4 fish.

            Example 2:
            Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,1]]
            Output: 1
            Explanation: The fisher can start at cells (0,0) or (3,3) and collect a single fish.
 */

package LeetCode;

public class program28 {

    static int findMaxFish(int[][] grid) {

        int temp = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                int sum = 0;

                sum = grid[i][j];

                if (sum == 0) {
                    continue;
                }

                if (i - 1 >= 0) {
                    sum += grid[i - 1][j];

                }

                if (i + 1 < grid.length) {
                    sum += grid[i + 1][j];

                }

                if (j - 1 >= 0) {
                    sum += grid[i][j - 1];

                }

                if (j + 1 < grid[i].length) {
                    sum += grid[i][j + 1];

                }
                // System.out.println(sum);

                if (sum > temp) {
                    temp = sum;
                }

            }

        }
        return temp;
    }

    public static void main(String[] args) {
        int[][] grid = { { 3, 10, 5, 8 } };
        int s = findMaxFish(grid);

        System.out.println(findMaxFish(grid));
    }

}
