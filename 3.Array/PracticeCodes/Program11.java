
/*
 Program 10 : Write a program that creates integer array of elements, 
 	      accepts values of arrays and Search for a number in an array of 10.
 */

package PracticeCodes;

import java.io.*;

public class Program11 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];

        System.out.println("Enter the element of array : ");
        for (int i = 0; i < size; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter the searching element : ");
        int Search = Integer.parseInt(br.readLine());

        boolean flag  = false;

        for (int i = 0; i < size; i++) {

            if (arr[i]  == Search) {

                flag = true;
                System.out.println("The element "+Search+" is found at index "+i);
                break;

            }
        }

        if(!flag){
            System.out.println("Element not found in array...!");
        }
        
    }
}

