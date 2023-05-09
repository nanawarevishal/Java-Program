
/*
 169. Majority Element
            Easy
            14.6K
            442
            Companies
            Given an array nums of size n, return the majority element.

            The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

            Example 1:
            Input: nums = [3,2,3]
            Output: 3

            Example 2:
            Input: nums = [2,2,1,1,1,2,2]
            Output: 2
 */


package LeetCode;

public class program50 {

    static int majorityElement(int[] nums) {

        int max = 0;
        int id = 0;
        for(int i=0;i<nums.length;i++){
            int cnt=1;

            for(int j=i+1;j<nums.length;j++){

                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt > max){
                max = cnt;
                id = i;

            }
        }

        return nums[id];
        
    }
    public static void main(String[] args) {
        
        int[] nums  ={3,2,3};

        System.out.println(majorityElement(nums));
    }
}
