

/*

    WAP to reverse each element in an array.
    Take size and elements from the user
    Input: 10 25 252 36 564
    Output: 01 52 252 63 465

 */


 package OneDimenArray.Assignment.Assignment03;
import java.io.*;
import java.util.ArrayList;

public class program2 {

    static ArrayList<Integer> reverseDigits(int[] arr){

        ArrayList<Integer>ls= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            int reverse = 0;
            while(temp!=0){
                int rem = temp % 10;
                reverse = reverse * 10 + rem;
                temp /=10;
            }
            ls.add(reverse);
        }

        return ls;
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

        ArrayList<Integer>ls= new ArrayList<>();
        ls = reverseDigits(a);

        System.out.println("The element with digits addition even are: "+ls);
    }
}
