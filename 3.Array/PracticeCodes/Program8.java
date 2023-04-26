
/*
 Program 7 : WAP to take 1-D array from user and print the Second Largest
             element of the array. (With sorting the array)
 */

 package PracticeCodes;

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 
 public class Program8 {
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
 

 
         for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i] > a[j]){

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
 
         System.out.println("The second maximum element of the array is : "+a[a.length-2]);
 
     }
     
 }
 
