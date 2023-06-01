
/*

        Program 4
        WAP to find a prime number from an array and return its index.
        Take size and elements from the user
        Input: 10 25 36 566 34 53 50 100
        Output: prime no 53 found at index: 5

 */



package OneDimenArray.Assignment.Assignment03;
import java.io.*;


public class program4 {


    static int isprime(int num[]){

        for(int i=0;i<num.length;i++){
            int count=0;
            for(int j=1;j<=num[i];j++){
                if(num[i]%j==0){
                    count++;
                }

                if(count>2){
                    break;
                }
            }

            if(count==2){
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

        System.out.println(" prime found at index: "+isprime(a));


    }
}

