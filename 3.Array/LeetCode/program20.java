
/*
        414. Third Maximum Number
        Easy
        2.5K
        2.8K
        Companies
        Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

        Example 1:
        Input: nums = [3,2,1]
        Output: 1
        Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2.
        The third distinct maximum is 1.

        Example 2:
        Input: nums = [1,2]
        Output: 2
        Explanation:
        The first distinct maximum is 2.
        The second distinct maximum is 1.
        The third distinct maximum does not exist, so the maximum (2) is returned instead.

        Example 3:
        Input: nums = [2,2,3,1]
        Output: 1
        Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2 (both 2's are counted together since they have the same value).
        The third distinct maximum is 1.
 */


package LeetCode;


public class program20 {

    static int thirdMax(int[] nums) {
        Integer fMax = null, sMax = null, tMax = null;
        // int tMax = null;
        // int sMax = Integer.MIN_VALUE;
        // int fMax = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
        fMax = Math.max(fMax, nums[i]);
        }

        for (int i : nums) {
            if(i!=fMax && i>sMax){
                sMax =i;
            }
        }

        for (int i : nums) {

            if(i!=fMax && i!=sMax && i>tMax){
                tMax =i;
            }

        }

        if(tMax ==null){
            return fMax;
        }

        return tMax;        
    }

    public static void main(String[] args) {

        int nums[] = {3,2,2,1};

        System.out.println(thirdMax(nums));
        
    }
    
}
