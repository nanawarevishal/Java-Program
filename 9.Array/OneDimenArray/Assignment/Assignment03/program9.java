
/*

        Program 9
        Write a program to print the second max element in the array
        Input: Enter array elements: 2 255 2 1554 15 65
        Output: 255

 */

package OneDimenArray.Assignment.Assignment03;

import java.io.*;

public class program9 {

    static int secMax(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(secMax < arr[i] && arr[i] !=max){
                secMax = arr[i];
            }
        }

        return secMax;
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

        System.out.println(" Second Max element in array : " + secMax(a));

    }

}
