
/*
 Program 18 : Write a Java program to find the duplicate values of 
 	      an array of integer values. 
 */


package PracticeCodes;
import java.io.*;
 
 public class Program17 {
 
     public static void main(String[] args) throws IOException {
 
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
         System.out.println("Enter the size of array : ");
         int size = Integer.parseInt(br.readLine());
 
         int[] a = new int[size];
 
         System.out.println("Enter the element of array : ");
         for (int i = 0; i < size; i++) {
             a[i] = Integer.parseInt(br.readLine());
         }

        //  for(int i=0;i<a.length;i++){

        //     for(int j=i+1;j<a.length;j++){

        //         if(a[i]>a[j]){

        //             int temp = a[i];
        //             a[i] = a[j];
        //             a[j] = temp;
        //         }
        //     }
        //  }

         System.out.println("The duplicate element from the array: ");

         for(int i=0;i<a.length-1;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[j]==a[i] && i!=j){

                    System.out.print(a[j]+" ");
    
                }
            }

         
         }

     }
 }
 
