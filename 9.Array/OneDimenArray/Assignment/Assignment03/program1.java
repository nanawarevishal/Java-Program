

/*

        Program 1
        Write a program to print count of digits in elements of array.
        Input: Enter array elements : 02 255 2 1554
        Output: 2 3 1 4

 */



package OneDimenArray.Assignment.Assignment03;

import java.util.*;
import java.io.*;

public class program1 {

    static HashMap<Integer,Integer> countDigits(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            int count =0;

            while(temp!=0){
                temp/=10;
                count++;
            }

            map.put(arr[i],count);
        }

        return map;
    }

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];

        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        HashMap<Integer, Integer> ls = new HashMap<>();

        ls= countDigits(a);

        System.out.println("The element with digits addition even are: "+ls);
    }
}
