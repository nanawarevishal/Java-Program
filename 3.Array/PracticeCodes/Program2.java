
//Program 2 : Sum of array elemnts 

package PracticeCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program2 {
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

        System.out.println("The sum of the array element is: "+sum);

        


    }
    
}
