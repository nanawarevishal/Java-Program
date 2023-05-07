
/*
 2643. Row With Maximum Ones
            Easy
            149
            4
            Companies
            Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, and the number of ones in that row.

            In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.

            Return an array containing the index of the row, and the number of ones in it.

            
            Example 1:
            Input: mat = [[0,1],[1,0]]
            Output: [0,1]
            Explanation: Both rows have the same number of 1's. So we return the index of the smaller row, 0, and the maximum count of ones (1). So, the answer is [0,1]. 

            Example 2:
            Input: mat = [[0,0,0],[0,1,1]]
            Output: [1,2]
            Explanation: The row indexed 1 has the maximum count of ones (2). So we return its index, 1, and the count. So, the answer is [1,2].

            Example 3:
            Input: mat = [[0,0],[1,1],[0,0]]
            Output: [1,2]
            Explanation: The row indexed 1 has the maximum count of ones (2). So the answer is [1,2].

 */



package LeetCode;

public class program26 {

    static int[] rowAndMaximumOnes(int[][] mat) {
        
        int[] res = new int[2];


        for(int i=0;i<mat.length;i++){

            int cnt=0;
            for(int j=0;j<mat[0].length;j++){
                
                if(mat[i][j]==1){
                    cnt++;
                }
            }

            if(res[1]==cnt){
                continue;
            }
            
           else if(cnt > res[1]){
                res[0] = i;
                res[1] = cnt;
            }

           
        }
        return res;
    }

    public static void main(String[] args) {
        
        int mat[][] = {{0,0},{1,1},{0,0}};

        int a[] = rowAndMaximumOnes(mat);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
