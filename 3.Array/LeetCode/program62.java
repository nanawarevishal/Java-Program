

/*

 35. Search Insert Position
            Easy
            13.2K
            578
            Companies
            Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

            You must write an algorithm with O(log n) runtime complexity.

            

            Example 1:
            Input: nums = [1,3,5,6], target = 5
            Output: 2

            Example 2:
            Input: nums = [1,3,5,6], target = 2
            Output: 1

            Example 3:
            Input: nums = [1,3,5,6], target = 7
            Output: 4

 */



package LeetCode;

public class program62 {

    static int searchInsert(int[] nums, int target) {
        int num =0;

        int left = 0;
        int right = nums.length-1;



        while(left<right){

            if(nums[left]==target){
                return left;
            }

            if(nums[right]==target){
                return right;
            }
            
            

            left++;
            right--;    
        }

        return num;
        
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
    }
}
