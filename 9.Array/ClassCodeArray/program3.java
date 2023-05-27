

package ClassCodeArray;
import java.io.*;

import java.io.IOException;

public class program3 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int arr[] = new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("The numbers are: ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
