
// Write the program to find the common element in array both having same or different

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class commonElement {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array1: ");
        int size1 = Integer.parseInt(br.readLine());

        int a1[] = new int[size1];
        
        System.out.println("Enter the array1 element: ");
        for(int i=0;i<size1;i++)
        {
            a1[i] = Integer.parseInt(br.readLine());
            
        }

        System.out.println("Enter the size of the array1: ");

        int size2 = Integer.parseInt(br.readLine());
        int a2[] = new int[size2];

        System.out.println("Enter the array2 element: ");

        for(int i=0;i<size2;i++)
        {
            a2[i] = Integer.parseInt(br.readLine());

        }

        System.out.println("The common elements are: ");

        if(size1 > size2)
        {
            int x=0;
            while(x < size2)
            {
                for(int i=0;i<size1;i++)
                {
                    if(a2[x]==a1[i])
                    {
                        System.out.println(a1[i]);
                    }

                }
                x++;
            }
        }

        else
        {
            int x=0;
            while(x < size1)
            {
                for(int i=0;i<size2;i++)
                {
                    if(a1[x]==a2[i])
                    {
                        System.out.println(a1[i]);
                    }

                }
                x++;
            }

        }
    }
}
