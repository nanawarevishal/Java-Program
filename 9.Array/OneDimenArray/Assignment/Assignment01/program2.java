
/*
    WAP to take size of array from user and also take integer elements from user Print
    product of even elements only
    input : Enter size : 9
    Enter array elements : 1 2 3 2 5 10 55 77 99
    output : 40
    // 2 * 2 * 10

 */



 package OneDimenArray.Assignment.Assignment01;
import java.io.*;

public class program2 {
    public static void main(String[] args)throws IOException {
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];
        System.out.println("Enter the elements: ");

        int Psum=1;
        for(int i=0;i<size;i++){
            a[i] = Integer.parseInt(br.readLine());

            if(a[i]%2==0){
                Psum *=a[i];
            }
        }

        System.out.println("Product  of Even element: "+Psum);
    }
}
