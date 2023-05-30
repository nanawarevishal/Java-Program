package OneDimenArray.ClassCodeArray;
import java.io.*;

public class program7 {
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];
        System.out.println("Enter the elements: ");

        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<size;i++){
            a[i] = Integer.parseInt(br.readLine());

            if(a[i]%2==0){
                evenCount++;
            }

            else{
                oddCount++;
            }
        }

        System.out.println("The count of even numbers is: "+evenCount);
        System.out.println("The count of odd numbers is: "+oddCount);
    }
}
