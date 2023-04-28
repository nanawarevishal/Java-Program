/*
   
80. Remove Duplicates from Sorted Array II
    Example 1:
    Input: nums = [1,1,1,2,2,3]
    Output: 5, nums = [1,1,2,2,3,_]
    Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).

    Example 2:
    Input: nums = [0,0,1,1,1,1,2,3,3]
    Output: 7, nums = [0,0,1,1,2,3,3,_,_]
    Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).

 */

package LeetCode;

public class Program2 {
    public static void main(String[] args) {

        int nums[] = {0,0,1,1,1,1,2,3,3,3};

        int cnt=0;
        int ind=1;

        for(int i=1;i<nums.length;i++){

            if(nums[i]==nums[i-1]){

                cnt++;
            }
            else{
                cnt=0;
            }

            if(cnt <=1){
                nums[ind] = nums[i];
                ind++;
            }
        }
        

        for(int i=0;i<nums.length;i++){

            System.out.println(nums[i]+" ");
        }

    }
}
