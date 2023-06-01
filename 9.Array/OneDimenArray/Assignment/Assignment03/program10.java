
/*

        Program 10
        Write a program to print the second min element in the array
        Input: Enter array elements: 255 2 1554 15 65 95 89
        Output: 15

 */






package OneDimenArray.Assignment.Assignment03;

import java.io.*;

public class program10 {

    static int secMin(int[] arr) {

        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(secMin > arr[i] && arr[i] !=min){
                secMin = arr[i];
            }
        }

        return secMin;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(" Second Min element in array : " + secMin(a));

    }

}
