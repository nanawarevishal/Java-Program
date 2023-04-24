
/*
 Program 10 : write a program to print the following pattern
	1
	8 9
	9 64 25
	64 25 216 49
 */


package For.Assignment.Assignment05;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {

    public static void main(String[] args)throws Exception {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int row  = Integer.parseInt(br.readLine());

        int num =1;
        int count=1;

        for(int i=1;i<=row;i++)
        {
            if(num % 2 !=0)
            {
                System.out.print(num * num + " ");
            }
            else
            {
                System.out.print(num*num*num+" ");
            }
            num++;

            if(count==i)
            {
                i=0;
                num--;
                count++;
                System.out.println();
            }

            if(count-1==row)
            {
                break;
            }

        }

    }
}



