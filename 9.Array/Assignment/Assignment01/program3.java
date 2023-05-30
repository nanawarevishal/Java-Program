

/*

        WAP to take size of array from user and also take integer elements from user Print
        product of odd index only
        input : Enter size : 6
        Enter array elements : 1 2 3 4 5 6
        output : 48
        //2 * 4 * 6

 */



package Assignment.Assignment01;
import java.io.*;

public class program3 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];
        System.out.println("Enter the elements: ");

        int Psum=1;
        for(int i=0;i<size;i++){
            a[i] = Integer.parseInt(br.readLine());

            if(i%2==1){
                Psum *=a[i];
            }
        }

        System.out.println("Sum of odd Index Element: "+Psum);
    }
}
