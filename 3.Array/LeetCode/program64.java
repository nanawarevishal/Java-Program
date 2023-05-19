

/*

 347. Top K Frequent Elements
            Medium
            13.5K
            496
            Companies
            Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

            

            Example 1:
            Input: nums = [1,1,1,2,2,3], k = 2
            Output: [1,2]

            Example 2:
            Input: nums = [1], k = 1
            Output: [1]


 */

package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class program64 {

    static int[] topKFrequent(int[] nums, int k) {

        int res[] = new int[k];

        HashMap<Integer,Integer>hsm = new HashMap<>();

        int cnt=0;
        for(int i=0;i<nums.length;i++){

            if(!hsm.containsKey(nums[i])){

            }
        }

        System.out.println(hsm);

        return res;
        
    }

    public static void main(String[] args) {
        
        int[] nums = {1,1,1,2,2,3};

        int k =2;

        System.out.println(topKFrequent(nums, k));

    }
    
}
