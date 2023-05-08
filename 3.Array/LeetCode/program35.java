
/*
 378. Kth Smallest Element in a Sorted Matrix
            Medium
            9K
            317
            Companies
            Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.

            Note that it is the kth smallest element in the sorted order, not the kth distinct element.

            You must find a solution with a memory complexity better than O(n2).

        
            Example 1:
            Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
            Output: 13
            Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13

            Example 2:
            Input: matrix = [[-5]], k = 1
            Output: -5
 */


package LeetCode;

import java.util.Arrays;

public class program35 {

    static int kthSmallest(int[][] matrix, int k) {

        int smallElement =0;
        int a[] = new int[matrix.length * matrix[0].length];
        int row =0;


        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++){

               a[row] = matrix[i][j];
               row++; 
            }

        }

        Arrays.sort(a);

        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }

        for(int i=0;i<a.length;i++){

            if(k-1==i){
                return a[i];
            }
        }
        return smallElement; 
    }

    public static void main(String[] args) {

        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};

        int k =8;

        System.out.println(kthSmallest(matrix, k));
        
    }
    
}
