/*

 Write the program to print the distict element from the array.


 */


package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program3 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size= Integer.parseInt(br.readLine());

        System.out.println("Enter the size of the array: ");
        int a[] = new int[size];

        System.out.println("Enter the element of the array: ");
        for(int i=0;i<a.length;i++){

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


        int i=0;
        for( i=1;i<=a.length-1;i++){

            if(a[i] !=a[i-1]){

                System.out.print(a[i-1]+" ");
            }
        }


        if(a[a.length-1]!=a[a.length-2]){

            System.out.print(a[a.length-1]+" end");
        }

    }

}

