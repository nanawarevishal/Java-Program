
/*
    456. 132 Pattern
        Medium
        5.6K
        311
        Companies
        Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].

        Return true if there is a 132 pattern in nums, otherwise, return false.

        Example 1:
        Input: nums = [1,2,3,4]
        Output: false
        Explanation: There is no 132 pattern in the sequence.

        Example 2:
        Input: nums = [3,1,4,2]
        Output: true
        Explanation: There is a 132 pattern in the sequence: [1, 4, 2].

        Example 3:
        Input: nums = [-1,3,2,0]
        Output: true


Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
 */


package LeetCode;

public class program14 {
    static boolean find132pattern(int[] nums) {

        boolean flag = false;

        for(int i=1;i<nums.length-1;i++){

            if((nums[i]> nums[i+1]) && (nums[i+1] > nums[i-1]) ){

                flag =true;
                return flag;
            }
        }
        return flag;
        
    }

    public static void main(String[] args) {
        int[] nums = {3,5,0,3,4};

        System.out.println(find132pattern(nums));
    }
    
}
