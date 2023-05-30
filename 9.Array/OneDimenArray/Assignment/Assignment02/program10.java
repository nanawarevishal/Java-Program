
/*
        Program 10
        WAP to print the elements whose addition of digits is even.
        Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
        Input :
        Enter array : 1 2 3 5 15 16 14 28 17 29 123
        Output: 2 15 28 17 123
 */




 package OneDimenArray.Assignment.Assignment02;

import java.io.*;
import java.util.ArrayList;

public class program10 {
    static ArrayList<Integer> digitsAddEven(int[] arr){

        ArrayList<Integer>ls = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            int sum = 0;
            while(temp!=0){
                int rem = temp % 10;
                sum +=rem;
                temp /=10;
            }

            if(sum % 2==0){
                ls.add(arr[i]);
            }
        }
        return ls;
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

        ArrayList<Integer>ls = new ArrayList<>();

        ls= digitsAddEven(a);

        System.out.println("The elment with digits addition even are: "+ls);
    }
}
