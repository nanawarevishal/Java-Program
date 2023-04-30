
/*
  287. Find the Duplicate Number
        Medium
        19K
        2.8K
        Companies
        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

        There is only one repeated number in nums, return this repeated number.

        You must solve the problem without modifying the array nums and uses only constant extra space.

        
        Example 1:

        Input: nums = [1,3,4,2,2]
        Output: 2
        Example 2:

        Input: nums = [3,1,3,4,2]
        Output: 3
 
 */

package LeetCode;

public class program8 {

    static int findDuplicate(int[] nums) {

        // int duplicate=0;
        // boolean flag= false;

        // for(int i=0;i<nums.length;i++){

        // for(int j=i+1;j<nums.length;j++){

        // if(nums[i]==nums[j]){
        // flag =true;
        // duplicate=nums[i];
        // break;
        // }
        // }
        // if(flag){
        // break;
        // }
        // }

        // return duplicate;

        int freq[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (freq[nums[i]] == 0) {
                freq[nums[i]] += 1;
            } else {
                return nums[i];
            }
        }
        return 0;

    }

    public static void main(String[] args) {

        int nums[] = { 1, 3, 4, 2, 2 };

        System.out.println(findDuplicate(nums));

    }
}
