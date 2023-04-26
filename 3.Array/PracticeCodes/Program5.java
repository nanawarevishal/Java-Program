
/*
 Program 5 : WAP to take 1-D array from user and print the smallest
             element of the array.

 */

package PracticeCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program5 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter the element of array: ");

        int a[] = new int[size];

        for(int i=0;i<a.length;i++)
        {
            a[i] = Integer.parseInt(br.readLine());
        }

        int min = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){

            if(a[i] < min){

                min = a[i];
            }
        }

        System.out.println("The minimum element of the array is "+min);

    }
    
}

