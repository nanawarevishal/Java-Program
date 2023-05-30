
/*

        Program 3
        Write a Java program to find the sum of even and odd numbers in an array.
        Display the sum value.
        Input: 11 12 13 14 15
        Output
        Odd numbers sum = 39
        Even numbers sum = 26

 */




 package OneDimenArray.Assignment.Assignment02;
import java.io.*;

public class program3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];
        System.out.println("Enter the elements: ");

        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<size;i++){
            a[i] = Integer.parseInt(br.readLine());

            if(a[i]%2==0){
                evenSum +=a[i];
            }

            else{
                oddSum +=a[i];
            }
        }

        System.out.println("The count of even numbers is: "+evenSum);
        System.out.println("The count of odd numbers is: "+oddSum);
    }
}
