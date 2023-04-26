
/*
 Program 33 : #LeetCode - Easy
 	      Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

	      You must implement a solution with a linear runtime complexity and use only constant extra space.

	      Example 1:
			Input: nums = [2,2,1]
			Output: 1
		
	      Example 2:
			Input: nums = [4,1,2,1,2]
			Output: 4
		
	      Example 3:
			Input: nums = [1]
			Output: 1
 
	      Constraints:
			1 <= nums.length <= 3 * 104
			-3 * 104 <= nums[i] <= 3 * 104
			Each element in the array appears twice except for one element which appears only once.
 */


package PracticeCodes;


public class Program18 {

    public static void main(String[] args) {
        
        int a[] = {4,1,2,1,2};
        int j=0;

        boolean flag = false;
        for(int i=0;i<a.length-1;i++){

            for(j=i+1;j<a.length;j++){

                if(a[i]!=a[j] && i!=j){

                    flag = true;
                    System.out.println(a[i]);
                    break;
                }

                else{
                    continue;
                }
                
            }
            if(flag){
                break;
            }
            
        }
    }
    
}
