
/*
 *  5 4 3 2 1
 *  8 6 4 2
 *  9 6 3
 *  8 4
 *  5
 */

package Pattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program6 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the the number of rows: ");
        int row = Integer.parseInt(br.readLine());
        int temp = row;

        for(int i=1;i<=row;i++)
        {
            int num = temp * i;
            for(int j=row;j>=i;j--)
            {
                System.out.print(num+" ");
                num -= i;
            }
            temp--;
            System.out.println();
        }
    }
}
