
/*
 41. First Missing Positive
        Hard

        Given an unsorted integer array nums, return the smallest missing positive integer.

        You must implement an algorithm that runs in O(n) time and uses constant extra space.

        

        Example 1:
        Input: nums = [1,2,0]
        Output: 3
        Explanation: The numbers in the range [1,2] are all in the array.

        Example 2:
        Input: nums = [3,4,-1,1]
        Output: 2
        Explanation: 1 is in the array but 2 is missing.

        Example 3:
        Input: nums = [7,8,9,11,12]
        Output: 1
        Explanation: The smallest positive integer 1 is missing.
 */

package LeetCode;

import java.util.Arrays;

public class program13 {

    static int firstMissingPositive(int[] nums) {
        int num = 1;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] == (num - 1)) {
                continue;
            }

            else {
                if (nums[i] != num) {

                    return num;
                }
                num++;
            }
        }

        return num;

    }

    public static void main(String[] args) {

        int nums[] = { 0, 1, 1, 2, 2 };

        System.out.println(firstMissingPositive(nums));

    }
}
