
/*

            Program 7
            WAP to find the common elements between two arrays.
            Input :
            Enter first array : 1 2 3 5
            Enter Second array: 2 1 9 8
            Output: Common elements :
            1
            2

 */


 package OneDimenArray.Assignment.Assignment02;
import java.io.*;
import java.util.ArrayList;

public class program7 {

    static ArrayList<Integer> commonElement(int[] arr1,int[] arr2){
        ArrayList<Integer>ls = new ArrayList<>();


        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    ls.add(arr1[i]);
                }
            }
        }
        return ls;
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

        ArrayList<Integer>ls = new ArrayList<>();

        ls = commonElement(arr1, arr2);
        System.out.println("The common elements in array: "+ls);
    }
}
