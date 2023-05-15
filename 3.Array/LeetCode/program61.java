
/*
 18. 4Sum
        Medium
        9.2K
        1.1K
        Companies
        Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

        0 <= a, b, c, d < n
        a, b, c, and d are distinct.
        nums[a] + nums[b] + nums[c] + nums[d] == target
        You may return the answer in any order.

        Example 1:
        Input: nums = [1,0,-1,0,-2,2], target = 0
        Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]


        Example 2:
        Input: nums = [2,2,2,2,2], target = 8
        Output: [[2,2,2,2]]
 */


package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class program61 {
    static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>>ls = new LinkedList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){

            if(i==0 || nums[i]!=nums[i-1]){

                for(int j=i+1;j<nums.length-2;j++){

                    if((j==i+1 || (nums[j]!=nums[j-1]))){
    
                        int left = j+1;
                        int right = nums.length-1;
    
                        Long sum =(long) target-(nums[i]+nums[j]);
    
                        while(left < right){
    
                            if(nums[left]+nums[right]==sum){
                                ls.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));

                                while(left < right && nums[left]==nums[left+1]){
                                    left++;
                                }

                                while(left < right && nums[right]==nums[right-1]){
                                    right--;
                                }

                                left++;
                                right--;
                            }

                            else if(nums[left]+nums[right]<sum){
                                left++;
                            }

                            else{
                                right--;
                            }
                        }
                    }
                }
            }
        }

        return ls;
        
    }
    
    public static void main(String[] args) {
        
        int[] nums = {1000000000,1000000000,1000000000,1000000000};

        int target = -294967296;

        List<List<Integer>>ls = fourSum(nums, target);

        System.out.println(ls);


    }   


    
}
