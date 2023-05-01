
/*
 494. Target Sum
        Medium
        9.2K
        312
        Companies
        You are given an integer array nums and an integer target.

        You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

        For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
        Return the number of different expressions that you can build, which evaluates to target.
        

        Example 1:
        Input: nums = [1,1,1,1,1], target = 3
        Output: 5
        Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
        -1 + 1 + 1 + 1 + 1 = 3
        +1 - 1 + 1 + 1 + 1 = 3
        +1 + 1 - 1 + 1 + 1 = 3
        +1 + 1 + 1 - 1 + 1 = 3
        +1 + 1 + 1 + 1 - 1 = 3

        Example 2:
        Input: nums = [1], target = 1
        Output: 1

 */


package LeetCode;

public class program15 {

    static int findTargetSumWays(int[] nums, int target) {
        int cnt=0;

        for(int i=0;i<nums.length;i++){

            
            
        }


        return cnt;
        
    }

    public static void main(String[] args) {

        int[] nums= {1,1,1,1,1};
        int target =3;

        System.out.println(findTargetSumWays(nums, target));
        
    }
}
