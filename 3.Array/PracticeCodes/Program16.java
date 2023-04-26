
/*
 Program 17 : Write a Java program to reverse an array of integer values. 
 */

 package PracticeCodes;
 import java.io.*;
 
 public class Program16 {
 
     public static void main(String[] args) throws IOException {
 
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
         System.out.println("Enter the size of array : ");
         int size = Integer.parseInt(br.readLine());
 
         int[] a = new int[size];
 
         System.out.println("Enter the element of array : ");
         for (int i = 0; i < size; i++) {
             a[i] = Integer.parseInt(br.readLine());
         }

         int lastInd = a.length-1;

         for(int i=0;i<a.length/2;i++)
         {
            int temp = a[i];
            a[i] = a[lastInd];
            a[lastInd] = temp;
            lastInd--;
         }

         System.out.println("The reversed array becomes: ");

         for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
         }
 
 
 
     }
 }
 
 
