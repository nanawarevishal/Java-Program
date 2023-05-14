

/*

 16. 3Sum Closest
        Medium
        9.1K
        478
        Companies
        Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

        Return the sum of the three integers.

        You may assume that each input would have exactly one solution.

        Example 1:
        Input: nums = [-1,2,1,-4], target = 1
        Output: 2
        Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).


        Example 2:
        Input: nums = [0,0,0], target = 1
        Output: 0
        Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

 */

package LeetCode;

import java.util.Arrays;

public class program60 {
    static int threeSumClosest(int[] nums, int target) {

        int res=0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){

            int left =i+1;
            int right = nums.length-1;

            while(left < right){

                int sum = nums[left]+nums[right]+nums[i];

                int diff = Math.abs(sum-target);

                if(diff==0){
                    return sum;
                }

                if(diff<min){
                    min = diff;
                    res = sum;
                }

                if(diff<=target){
                    left++;
                }

                else{
                    right--;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        
        int nums[] ={0,1,2};
        int target  =0;

        System.out.println(threeSumClosest(nums, target));
    }
}
