
/*
 Program 5 : write a program to print the following pattern
	A B C D
	B C D
	C D
	D
 */

package For.Assignment.Assignment05;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args)throws Exception {

        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int row  = Integer.parseInt(br.readLine());

        char ch = 'A';
        char ch1 = ch;
        int cnt = row;
        for(int i=1;i<=row;i++)
        {
            System.out.print(ch1++ +" ");

            if(cnt==i)
            {
                i=0;
                cnt--;
                ch++;
                ch1 =ch;
                System.out.println();

            }

            if(cnt==0)
            {
                break;
            }

        }

    }

    
}
