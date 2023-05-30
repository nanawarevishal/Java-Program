

/*
        Write a program ,take 10 input from the user and print only elements that are divisible by
        5.
        Input: 10 2 2 3 3 3 4 4 25 55
        Output: 10 25 55

 */



package Assignment.Assignment01;
import java.io.*;

public class program5 {
    public static void main(String[] args)throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];
        System.out.println("Enter the elements: ");

        for(int i=0;i<size;i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0;i<size;i++){
            if(a[i]%5==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
