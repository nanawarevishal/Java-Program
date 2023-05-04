
/*
  Take N as input. Count all its factors and print count

   Input : 6
   output : 
 */

package ForLoop.ClassCodes;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int N = Integer.parseInt(br.readLine());

        int cnt=0;
        for(int i=1;i<=N;i++){

            if(N % i==0){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}
