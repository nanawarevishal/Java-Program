/*
 2574. Left and Right Sum Differences
        Easy
        Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

        answer.length == nums.length.
        answer[i] = |leftSum[i] - rightSum[i]|.
        Where:

        leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
        rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
        Return the array answer.

        
        Example 1:
        Input: nums = [10,4,8,3]
        Output: [15,1,11,22]
        Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
        The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

       
        Example 2:
        Input: nums = [1]
        Output: [0]
        Explanation: The array leftSum is [0] and the array rightSum is [0].
        The array answer is [|0 - 0|] = [0].

 */

package LeetCode;

public class program7 {

    static int[] leftRigthDifference(int[] nums) {

        int lsum[] = new int[nums.length];
        int rsum[] = new int[nums.length];

        int output[] = new int[rsum.length];

        int x = 1;
        for (int i = 0; i < nums.length - 1; i++) {

            lsum[x] = lsum[x - 1] + nums[i];
            x++;

        }

        int sum = 0;

        for (int j = nums.length - 1; j >= 1; j--) {

            sum += nums[j];
        }

        rsum[0] = sum;

        for (int i = 1; i < nums.length; i++) {

            rsum[i] = rsum[i - 1] - nums[i];

        }


        for (int i = 0; i < output.length; i++) {
            output[i] = Math.abs(lsum[i] - rsum[i]);
        }

        return output;

    }

    public static void main(String[] args) {

        int nums[] = { 1 };

        // leftRigthDifference(nums);

        int a[] = leftRigthDifference(nums);

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }

    }
}
