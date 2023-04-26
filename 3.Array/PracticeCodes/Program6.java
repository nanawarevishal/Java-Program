/*
 Program 6 : Write a program that creates integer array of 
 	      elements, accepts values of arrays and Find Average.
 */



package PracticeCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program6 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter the element of array: ");

        int a[] = new int[size];
        int sum = 0;

        for(int i=0;i<a.length;i++)
        {
            a[i] = Integer.parseInt(br.readLine());
            sum +=a[i];
        }

        int avg = sum/a.length;

        System.out.println("The average of the array element is: "+(avg));

        


    }
    
}
