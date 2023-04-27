/* 
34. Find First and Last Position of Element in Sorted Array
Medium

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

*/

package LeetCode;


public class program1 {

    public static void main(String[] args) {
         
        int nums[]={5,7,7,8,8,10};

        int target =8;

        int left =0;
        int right = nums.length-1;

        int output[] = new int[2];

        while(left<=right){

            if(nums[left]==target){

                output[0] = left;

                while(left<right){

                    if(nums[right]==target){

                        output[1] = right;
                        System.out.println(output[0]+" "+output[1]);
                        break;
                    }

                    else{

                        right -=1;
                    }
                }

                output[1] = left;
                System.out.println(output[0]+" "+output[1]);
                break;

            }
            else if(nums[left]<target){

                left +=1;
            }
            else if(nums[right]>target){
                right -=1;
            }
        }
        
        
    }
    
}
