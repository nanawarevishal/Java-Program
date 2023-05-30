
/*
        Program 1
        Write a program to create an array of ‘n’ integer elements.
        Where ‘n’ value should be taken from the user.
        Insert the values from users and find the sum of all elements in the array.
        Input:
        n=6
        Enter elements in the array: 2 3 6 9 5 1
        Output:
        26

 */




package OneDimenArray.Assignment.Assignment02;
import java.io.*;

public class program1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];
        System.out.println("Enter the elements: ");

        int sum=0;
        for(int i=0;i<size;i++){
           a[i] = Integer.parseInt(br.readLine());
            sum +=a[i];
        }

       System.out.println("Sum: "+sum);

    }
}
