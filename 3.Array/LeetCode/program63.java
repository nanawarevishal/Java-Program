

/*
448. Find All Numbers Disappeared in an Array
            Easy
            8.4K
            433
            Companies
            Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

            

            Example 1:
            Input: nums = [4,3,2,7,8,2,3,1]
            Output: [5,6]

            Example 2:
            Input: nums = [1,1]
            Output: [2]
 */


package LeetCode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class program63 {

    static List<Integer> findDisappearedNumbers(int[] nums) {


        List<Integer>ls = new ArrayList<Integer>();
        Arrays.sort(nums);

        int n = 1;

        for(int i=1;i<nums.length;i++){

           
        }

        return ls;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer>ls = new ArrayList<Integer>();

        ls = findDisappearedNumbers(nums);

        System.out.print(ls+" ");

       
    }
}
