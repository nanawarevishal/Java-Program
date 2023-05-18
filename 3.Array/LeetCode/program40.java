
/*

 219. Contains Duplicate II
                Easy
                4.8K
                2.6K
                Companies
                Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

                

                Example 1:
                Input: nums = [1,2,3,1], k = 3
                Output: true

                Example 2:
                Input: nums = [1,0,1,1], k = 1
                Output: true

                Example 3:
                Input: nums = [1,2,3,1,2,3], k = 2
                Output: false


 */


package LeetCode;

public class program40 {

    static boolean containsNearbyDuplicate(int[] nums, int k) {

        int left = 0;
        int right = nums.length-1;

        while(left<right){

            int diff = Math.abs(left-right);
            if(nums[left]==nums[right] && diff<=k){
                return true;
            }


        }

        return false;
        
    }

    public static void main(String[] args) {
        
        int[] nums = {1,0,1,1};
        int k=1;

        System.out.println(containsNearbyDuplicate(nums, k));
    }
    
}
