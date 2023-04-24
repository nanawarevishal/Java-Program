
/*
 Program 4 : write a program to print the following pattern
	1 2 3 4
	2 3 4
	3 4
	4
 */

package For.Assignment.Assignment05;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program4 {
    public static void main(String[] args)throws Exception {

        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int row  = Integer.parseInt(br.readLine());

        int num =1;
        int cnt=row;
        
        int num1 = num;
        for(int i=1;i<=row;i++)
        {
            System.out.print(num1+" ");
            num1++;

            if(cnt==i)
            {
                i=0;
                cnt--;
                num++;
                num1 = num;
                System.out.println();
            
            }

            if(cnt==0)
            {
                break;
            }

         
        }
        
    }
}
