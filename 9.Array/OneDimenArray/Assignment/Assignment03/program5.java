
/*

            Program 5
            WAP to find a Perfect number from an array and return its index.
            Take size and elements from the user
            Input: 10 25 252 496 564
            Output: Perfect no 496 found at index: 3

 */



package OneDimenArray.Assignment.Assignment03;
import java.io.*;


public class program5 {


    static int perfectNumber(int num[]){

        for(int i=0;i<num.length;i++){
            int sum =0;
            for(int j=1;j<num[i];j++){
                if(num[i]%j==0){
                    sum +=j;
                }   
            }

            if(sum==num[i]){
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

        System.out.println(" perfect found at index: "+perfectNumber(a));


    }
}


