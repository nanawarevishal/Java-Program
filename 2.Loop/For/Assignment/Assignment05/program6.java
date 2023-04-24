
/*
 Program 6 : write a program to print the following pattern
	1
	2 3
	3 4 5
	4 5 6 7
 */


package For.Assignment.Assignment05;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program6 {
    public static void main(String[] args)throws Exception {

        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int row  = Integer.parseInt(br.readLine());

        int num =1;
        int cnt=1;
    

        for(int i=1;i<=row;i++)
        {
            System.out.print(num+" ");
            num++;

            if(cnt==i)
            {
                i=0;
                cnt++;
                num=cnt;
                System.out.println();
            }

            if(cnt-1==row)
            {
                break;
            }
        }
    }
    
}
