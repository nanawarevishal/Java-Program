

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class secLargestElement {
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

        int max = a[0];

        for(int i=0;i<a.length;i++)
        {
            if(max <= a[i])
            {
                max =a[i];
            }
            // max = Math.max(max, a[i]);
        }

        int secmax = a[0];

        for(int i=0;i<a.length;i++)
        {
           
            if(a[i] != max)
            {
                if(secmax <= a[i])
                {
                    secmax = a[i];
                }
                // secmax = Math.max(secmax, a[i]);
            }
        }

        System.out.print("\nThe sencond largest element in the array: ");
        System.out.println(secmax);
    }
    
}
