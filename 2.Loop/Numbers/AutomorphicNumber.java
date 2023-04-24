package Numbers;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AutomorphicNumber {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int temp = num;
        int cnt=0;
        while(temp!=0)
        {   
            cnt++;
            temp/=10;
        }

        int x = 1;
        while(cnt > 0)
        {
            x *=10;
            cnt--;
        }

        int autoNum = (num*num) % x;

        if(num==autoNum)
        {
            System.out.println(num+" it is the automorphic number.");
        }

        else
        {
            System.out.println(num+" it is not the automorphic number.");
        }
    }
}
