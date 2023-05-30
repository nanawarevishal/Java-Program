
/*

        Program 6
        WAP to take size of array from user and also take integer elements from user
        find the maximum element from the array
        input : Enter size : 5
        Enter array elements: 1 2 5 0 4
        output: max element = 5

 */

 package OneDimenArray.Assignment.Assignment02;
import java.io.*;

public class program6 {
 static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        return max;
        
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

        System.out.println("The maximum element in array: "+maxElement(a));

    }
}
