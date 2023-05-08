
/*
 Program 14 : Write a Java program to remove a specific element from an array.
 	      note : Every element is Unique in array

	      input = {1,2,3,4,5}
	      Element = 3
	      Oupput = {1,2,4,5,0}
 */

package PracticeCodes;
import java.io.*;

public class Program14 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int[] a = new int[size];

        System.out.println("Enter the element of array : ");
        for (int i = 0; i < size; i++) {

            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the element to remove: ");
        int element = Integer.parseInt(br.readLine());

        int ind =0;
        boolean flag  = false;
        for(int i=0;i<a.length;i++){

            if(element == a[i]){
                flag =true;
                ind = i;
                break;
            }
        }

        if(!flag){

            System.out.println("Element not found...!");
        }

        else{

            for(int i=ind;i<a.length-1;i++){

                a[i] = a[i+1];
            }
    
            // a[a.length-1] =0;
    
            System.out.println("The element of the array are: ");
            for(int i=0;i<a.length;i++){
    
                System.out.print(a[i]+" ");
            }

        }

        
    }
    
}
