

/*

        Program 6
        WAP to find a palindrome number from an array and return its index.
        Take size and elements from the user
        Input: 10 25 252 36 564

        Output: Palindrome no 252 found at index: 2

 */




package OneDimenArray.Assignment.Assignment03;
import java.io.*;


public class program6 {

    static int palindromeNumber(int num[]){

        for(int i=0;i<num.length;i++){

            int temp=num[i];
            int sum=0;
            while(temp!=0){
                int rev= temp%10;
                sum  = sum *10+rev;
                temp /=10;
            }

            if(num[i]==sum){
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

        System.out.println(" Palindrome number found at index: "+palindromeNumber(a));


    }
}



