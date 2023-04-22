import java.io.BufferedReader;

import java.io.InputStreamReader;

// Writer the program to print the product of the even element in the array


public class productOfElement {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];

        System.out.println("Enter the array element: ");
        for(int i=0;i<size;i++)
        {
            a[i] = Integer.parseInt(br.readLine());

        }

        int mult = 1;

        for(int i=0;i<a.length;i++)
        {
            if(a[i] % 2==0)
            {
                mult = mult * a[i];
            }

        }

        System.out.println("The product of the even element is: "+mult);

    }
}
