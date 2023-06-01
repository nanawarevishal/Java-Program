
/*

        Program 3
        WAP to find a composite number from an array and return its index.
        Take size and elements from the user
        Input: 1 2 3 5 6 7
        Output: composite 6 found at index: 4

 */



 package OneDimenArray.Assignment.Assignment03;
import java.io.*;


public class program3 {

    static int comppositeNumber(int[] arr){

       
        for(int i=0;i<arr.length;i++){
           
            if(!(isprime(arr[i]))){
                return i;
            }
        }

        return -1;
    }

    static boolean isprime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }

            if(count>2){
                break;
            }
        }

        if(count>2){
            return false;
        }

        return true;
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

        System.out.println(" composite found at index: "+comppositeNumber(a));


    }
}
