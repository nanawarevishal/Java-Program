
/*

        Program 9
        Write a Java program to merge two given arrays.
        Array1 = [10, 20, 30, 40, 50]
        Array2 = [9, 18, 27, 36, 45]
        Output :
        Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
        Hint: you can take 3rd array

 */


 package OneDimenArray.Assignment.Assignment02;
import java.io.*;

public class program9 {

    static int[] mergeArray(int[] arr1,int[] arr2){
        int[] merged = new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            merged[i] = arr1[i];
            merged[arr1.length+i] = arr2[i];
        }
        return merged;
    }
    
     public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size1 = Integer.parseInt(br.readLine());

        int arr1[] = new int[size1];
        System.out.println("Enter the elements of array1: ");


        for(int i=0;i<size1;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the size of the array2: ");
        int size2 = Integer.parseInt(br.readLine());

        int arr2[] = new int[size2];
        System.out.println("Enter the elements of array2: ");


        for(int i=0;i<size2;i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }

        int arr[] = new int[size1+size2];

        arr = mergeArray(arr1, arr2);
        System.out.println("The merged array becomes: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
