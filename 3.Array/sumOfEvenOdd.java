import java.io.BufferedReader;
import java.io.InputStreamReader;


public class sumOfEvenOdd {
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

        int even=0;
        int odd=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] % 2==0)
            {
                even += a[i];
            }

            else
            {
                odd +=a[i];
            }
        }

        System.out.println("The of the even Element in the array: "+even);
        System.out.println("The of the odd Element in the array: "+odd);
    }
}
