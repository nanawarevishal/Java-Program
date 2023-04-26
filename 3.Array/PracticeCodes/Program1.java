
/*
 Program 1 : WAP to create 1-D array of length n from user and also take value
             from user and print whole 1-D array.
 */



package PracticeCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program1 {
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

        System.out.println("The array becomes: ");

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        


    }
    
}
