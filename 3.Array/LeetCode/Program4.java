
/*
 215. Kth Largest Element in an Array
    Medium

    Given an integer array nums and an integer k, return the kth largest element in the array.

    Note that it is the kth largest element in the sorted order, not the kth distinct element.

    You must solve it in O(n) time complexity.

    Example 1:
    Input: nums = [3,2,1,5,6,4], k = 2
    Output: 5

    Example 2:
    Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
    Output: 4
 
 */


package LeetCode;

public class Program4 {
    public static void main(String[] args) {

        int nums[] = {3,2,3,1,2,4,5,5,6};

        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){

                if(nums[i] > nums[j]){

                    int temp = nums[i];
                    nums[i] =nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        
        
    }
}
