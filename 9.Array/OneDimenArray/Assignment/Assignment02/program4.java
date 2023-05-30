

/*
        Program 4
        WAP to search a specific element from an array and return its index.
        Input: 1 2 4 5 6
        Enter element to search: 4
        Output: element found at index: 2
 */



 package OneDimenArray.Assignment.Assignment02;
import java.io.*;

public class program4 {

    static int searchElement(int[]arr,int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
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

        System.out.println("Enter the element to be search: ");
        int target = Integer.parseInt(br.readLine());

       int x = searchElement(a, target);

       if(x>0){
        System.out.printf("The index of the element %d is %d",target,x);
       }

       else{
        System.out.println("Element not found...!");
       }
    }
}
