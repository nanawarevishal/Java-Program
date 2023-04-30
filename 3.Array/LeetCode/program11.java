
/*
 189. Rotate Array
        Medium
        13.9K
        1.6K
        Companies
        Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

        
        Example 1:
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]


        Example 2:
        Input: nums = [-1,-100,3,99], k = 2
        Output: [3,99,-1,-100]
        Explanation: 
        rotate 1 steps to the right: [99,-1,-100,3]
        rotate 2 steps to the right: [3,99,-1,-100]
 */

package LeetCode;

public class program11 {

    static void rotate(int[] nums, int k) {

        for (int j = 1; j <= k; j++) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {

                nums[i + 1] = nums[i];

            }
            nums[0] = temp;

        }

        // for(int i=0;i<nums.length;i++){

        //     System.out.print(nums[i]+" ");
        // }

    }

    public static void main(String[] args) {

        int[] nums = { -1,-100,3,9};
        int k = 2;

        rotate(nums, k);

    }

}
