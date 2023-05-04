
/*
 136. Single Number
        Easy
        13.7K
        524
        Companies
        Given a non-empty numsay of integers nums, every element appears twice except for one. Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.

        

        Example 1:

        Input: nums = [2,2,1]
        Output: 1
        Example 2:

        Input: nums = [4,1,2,1,2]
        Output: 4
        Example 3:

        Input: nums = [1]
        Output: 1
 */

package LeetCode;

import java.util.Arrays;

public class program16 {

    static int singleNumber(int[] nums) {
        // 1 1 2 2 4
        Arrays.sort(nums);

        if(nums.length>1){

            if(nums[0] != nums[1]){
                return nums[0];
            }
            for(int i = 1; i < nums.length - 1 ; i++){
    
                if(nums[i] != nums[i + 1] && nums[i] != nums[ i - 1]){
                    
                    return nums[i];
                }
            }
            if(nums[nums.length - 2] != nums[nums.length - 1]){
                return nums[nums.length - 1];
            }
        }
        
        else{
            return nums[0];
        }
        return 0;


    }
    public static void main(String[] args) {

        int[] nums ={4,1,2,1,2};

        System.out.println(singleNumber(nums));
        
    }
}
