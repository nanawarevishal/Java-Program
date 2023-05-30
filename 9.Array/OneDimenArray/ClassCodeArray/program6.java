package OneDimenArray.ClassCodeArray;
import java.io.*;

public class program6 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];
        System.out.println("Enter the elements: ");

        int count=0;
        for(int i=0;i<size;i++){
            a[i] = Integer.parseInt(br.readLine());

            if(a[i]%2==0){
                count++;
            }
        }

        System.out.println("The count of even numbers is: "+count);
    }
}
