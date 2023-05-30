package OneDimenArray.ClassCodeArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program4 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers: ");

        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("The numbers are: ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


/*
 Enter the numbers: 
12
23
4
A  or 78.90 
Exception in thread "main" java.lang.NumberFormatException: For input string: "A"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:786)
        at ClassCodeArray.program4.main(program4.java:16)


 */