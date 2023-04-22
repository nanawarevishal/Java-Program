
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class printElementDivisibleBy5 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int a[] = new int[size];

        System.out.println("Enter the array element: ");
        for(int i=0;i<size;i++)
        {
            a[i] = Integer.parseInt(br.readLine());

        }

        System.out.println("The element which are divisible by 5 are: ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i] % 5==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
