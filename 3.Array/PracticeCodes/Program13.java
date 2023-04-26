
/*
 Program 12 : Write a program to take in 10 values and 
 	      print only those numbers which are palindrome.
 */


package PracticeCodes;

import java.io.*;

public class Program13 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int[] a = new int[size];

        System.out.println("Enter the element of array : ");
        for (int i = 0; i < size; i++) {

            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("The palindrome numbers are: ");
        for(int i=0;i<a.length;i++)
        {
            int num = a[i];
            int pal = 0;

            while(num!=0)
            {
                int rem = num % 10;
                pal = pal * 10 +rem;

                num /=10;
                
            }

            if(pal == a[i]){

                System.out.print(a[i]+" ");
            }
        }
    }
}
