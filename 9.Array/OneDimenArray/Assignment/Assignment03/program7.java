

/*

        Program 7
        WAP to find a Strong number from an array and return its index.
        Take size and elements from the user
        Input: 10 25 252 36 564 145
        Output: Strong no 145 found at index: 5


 */



package OneDimenArray.Assignment.Assignment03;
import java.io.*;

public class program7 {

    static int strongNumber(int[] arr){

        for(int i=0;i<arr.length;i++){
            int sum =0;
            int temp =arr[i];
            while(temp!=0){

                int rev = temp%10;
                int fact=1;
                for(int j=1;j<=rev;j++){
                    fact = fact *j;
                }
                sum +=fact;

                temp /=10;
            }

            if(sum == arr[i]){
                return i;
            }
            
        }

        return -1;
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

        System.out.println(" Strong number found at index: "+strongNumber(a));



    }
    
}
