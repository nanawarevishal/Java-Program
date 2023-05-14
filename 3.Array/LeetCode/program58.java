
/*
 1. Two Sum
            Easy
            46.1K
            1.5K
            Companies
            Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

            You may assume that each input would have exactly one solution, and you may not use the same element twice.

            You can return the answer in any order.

            

            Example 1:
            Input: nums = [2,7,11,15], target = 9
            Output: [0,1]
            Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


            Example 2:
            Input: nums = [3,2,4], target = 6
            Output: [1,2]

            Example 3:
            Input: nums = [3,3], target = 6
            Output: [0,1]

 */

package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class program58 {

    static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int Needed = target - num;
            if (mpp.containsKey(Needed)) {
                ans[0] = mpp.get(Needed);
                ans[1] = i;
                return ans;
            }

            mpp.put(nums[i], i);
        }
        return ans;

        // Arrays.sort(nums);

        // int left = 0;
        // int right = nums.length-1;


        // while(left<right){

        //     if(nums[left]+nums[right]<target){
        //         left++;
        //     }

        //     if(nums[left]+nums[right]>target){
        //         right--;
        //     }

        //     if(nums[left]+nums[right]==target){
        //         System.out.println("Found"+nums[left]+" "+nums[right]);
        //         break;
        //     }
        // }

        // return ans;
    }

    public static void main(String args[]) {

        int[] nums = { 3,2,4,8,12,43};
        int target = 14;

        int[] a = twoSum(nums, target);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
