
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class secMin {

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

        int min = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(min > a[i])
            {
                min =a[i];
            }
            // min = Math.min(min, a[i]);
        }

        int secmin = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
           
            if(a[i] > min)
            {
                if(secmin > a[i])
                {
                    secmin = a[i];
                }
                // secmax = Math.max(secmax, a[i]);
            }
        }
        System.out.print("\nThe sencond largest element in the array: ");
        System.out.println(secmin);
    }
    


}
