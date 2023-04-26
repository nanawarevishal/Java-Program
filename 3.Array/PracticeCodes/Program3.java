
 /*
   Program 3 : WAP to compare two arrays by with length and elements given by
   	       user if array are equal then print “Equal” otherwise print “Not
     	       Equal.
 */
 

package PracticeCodes;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program3 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array1: ");
        int size1 = Integer.parseInt(br.readLine());

        System.out.println("Enter the element of array: ");

        // int array1[] = new int[size1];

        System.out.println("Enter the size of the array2: ");
        int size2 = Integer.parseInt(br.readLine());

        System.out.println("Enter the element of array: ");

        // int array2[] = new int[size2];

        if(size1==size2){

            System.out.println("The lenght of the arra1 is equal to array2");
        }

        else{

            System.out.println("The lenght of the arra1 is not equal to array2");
        }


        


    }
    
}
