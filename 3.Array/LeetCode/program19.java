
/*

        645. Set Mismatch
        Easy
        3.6K
        831
        Companies
        You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

        You are given an integer array nums representing the data status of this set after the error.

        Find the number that occurs twice and the number that is missing and return them in the form of an array.

        
        Example 1:
        Input: nums = [1,2,2,4]
        Output: [2,3]

        Example 2:
        Input: nums = [1,1]
        Output: [1,2]

 */

package LeetCode;

public class program19 {
    static int[] findErrorNums(int[] nums) {
        int res[] = new int[2];
        int diff=1;

        for (int i = 1; i < nums.length; i++) {

            
  
        }
        return res;
    }

    public static void main(String[] args) {

        int nums[] = {1,2,2,4};
        int a[] = new int[2];

        a = findErrorNums(nums);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
