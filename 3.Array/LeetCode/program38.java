
/*
 1929. Concatenation of Array
        Easy
        2.3K
        291
        Companies
        Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

        Specifically, ans is the concatenation of two nums arrays.

        Return the array ans.

        

        Example 1:
        Input: nums = [1,2,1]
        Output: [1,2,1,1,2,1]
        Explanation: The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
        - ans = [1,2,1,1,2,1]

        Example 2:
        Input: nums = [1,3,2,1]
        Output: [1,3,2,1,1,3,2,1]
        Explanation: The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
        - ans = [1,3,2,1,1,3,2,1]

 */


package LeetCode;

import javax.sound.sampled.SourceDataLine;

public class program38 {

    static int[] getConcatenation(int[] nums) {

        int res[] = new int[nums.length*2];

        int j=0;
        for(int i=0;i<nums.length;i++){ 
            res[i] = nums[j];
            res[2*i+nums.length-i] = nums[j];
            j++;
        }
        
        return res;
        
    }

    public static void main(String[] args) {
        int nums[] ={1,3,2,1};

        int a[] = getConcatenation(nums);

        for(int i=0;i<a.length;i++){

            System.out.print(a[i]+" ");
        }
    }
    
}
