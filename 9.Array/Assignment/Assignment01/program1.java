

/*
            Program 1
            WAP to take size of array from user and also take integer elements from user Print sum
            of odd elements only
            input : Enter size : 5
            Enter array elements : 1 2 3 4 5
            output : 9
            //1 + 3 + 5

 */




package Assignment.Assignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

            if(a[i]%2==1){
                sum +=a[i];
            }
        }

        System.out.println("Sum of odd element: "+sum);
    }
}
