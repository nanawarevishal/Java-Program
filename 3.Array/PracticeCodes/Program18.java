
/*
 Program 33 : #LeetCode - Easy
 	      Given a non-empty aay of integers nums, every element appears twice except for one. Find that single one.

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
			Each element in the aay appears twice except for one element which appears only once.
 */


package PracticeCodes;
import java.io.*;


public class Program18 {
    static int singleNumber(int a[]){
		
		for(int i = 0 ; i < a.length; i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i]>a[j]){

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp; 
                }
            }
			
		}

        for(int i=0;i<a.length;i++){

            System.out.print(a[i]+" ");
        }

	
		if(a[0] != a[1]){
			return a[0];
		}
		for(int i = 1; i < a.length - 1 ; i++){

			if(a[i] != a[i + 1] && a[i] != a[ i - 1]){
				
				return a[i];
			}
		}
		if(a[a.length - 2] != a[a.length - 1]){
			return a[a.length - 1];
		}
		return 0;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of aay : ");
		int size = Integer.parseInt(br.readLine());

		int[] a = new int[size];

		System.out.println("Enter the array Elements : ");
		for(int i = 0 ; i < size; i++){
			
			a[i] = Integer.parseInt(br.readLine());
		}

		int single = singleNumber(a);
		System.out.println("Single Element : " + single);
	}
}