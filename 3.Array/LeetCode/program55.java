

/*
 442. Find All Duplicates in an Array
            Medium
            8.5K
            309
            Companies
            Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

            You must write an algorithm that runs in O(n) time and uses only constant extra space.

            

            Example 1:
            Input: nums = [4,3,2,7,8,2,3,1]
            Output: [2,3]

            Example 2:
            Input: nums = [1,1,2]
            Output: [1]

            Example 3:
            Input: nums = [1]
            Output: []
 */


package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class program55 {
    static List<Integer> findDuplicates(int[] nums) {

        List<Integer>ls = new ArrayList<Integer>();

        if(nums.length==1){
            return ls;
        }

        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){

                if(nums[i]==nums[j]){
                    ls.add(nums[i]);
                }
            }
        }
        return ls;
        
    }

    public static void main(String[] args) {
        List<Integer>ls = new ArrayList<Integer>();

        int[] nums = {1,1,2};

        ls = findDuplicates(nums);

        System.out.println(ls);
    }
    
}
