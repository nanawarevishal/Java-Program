
/*
 283. Move Zeroes
            Easy
            13.5K
            344
            Companies
            Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

            Note that you must do this in-place without making a copy of the array.

            

            Example 1:
            Input: nums = [0,1,0,3,12]
            Output: [1,3,12,0,0]

            Example 2:
            Input: nums = [0]
            Output: [0]
 */

package LeetCode;

public class program45 {
    static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            if (nums[i] == 0) {
                cnt++;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - cnt] = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String[] args) {

        int[] nums = { 0, 0, 1 };

        moveZeroes(nums);
    }

}
