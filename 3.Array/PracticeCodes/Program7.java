
/*
 Program 7 : WAP to take 1-D array from user and print the Second Largest
             element of the array. (Without sorting the array)
 */

package PracticeCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program7 {
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

        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){

            if(a[i] > max){

                max = a[i];
            }
        }

        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){

            if(a[i] != max){

                if(a[i] > secMax){

                    secMax = a[i];
                }
            }
        }

        System.out.println("The second maximum element of the array is : "+secMax);

    }
    
}
