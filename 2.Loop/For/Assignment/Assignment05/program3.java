
/*
 Program 3 : write a program to print the following pattern
	10
	10 9
	9 8 7
	7 6 5 4
 */


package For.Assignment.Assignment05;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program3 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int row  = Integer.parseInt(br.readLine());

        int num =10;
        int cnt=1;

        for(int i=1;i<=row;i++)
        {
            System.out.print(num+" ");
            num--;

            if(i==cnt)
            {
                i=0;
                cnt++;
                num++;
                System.out.println();
            }

            if(cnt-1==row)
            {
                break;
            }
        }

        

    }
}
