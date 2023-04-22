
// Write the program to print the sum of element in array

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class printThesum {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];

        System.out.println("Enter the array element: ");
        for(int i=0;i<size;i++)
        {
            a[i] = Integer.parseInt(br.readLine());

        }

        int sum=0;
        System.out.println("The of the array Element is: ");
        for(int i=0;i<a.length;i++)
        {
            sum += a[i];

        }

        System.out.println(sum);
    
    }
}
