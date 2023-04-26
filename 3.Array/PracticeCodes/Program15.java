/*
 Program 16 : Write a Java program to insert an element (specific position) into an array.
 */



package PracticeCodes;
import java.io.*;

public class Program15 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int[] a = new int[size];

        System.out.println("Enter the element of array : ");
        for (int i = 0; i < size-1; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the element to insert: ");
        int element = Integer.parseInt(br.readLine());

        System.out.println("Enter the index of element to insert: ");
        int ind = Integer.parseInt(br.readLine());

        for(int i=a.length-1;i>=ind;i--)
        {
            a[i] = a[i-1];
        }

        a[ind] = element;

        for(int i=0;i<a.length;i++){

            System.out.print(a[i]+" ");
        }


    }
}

