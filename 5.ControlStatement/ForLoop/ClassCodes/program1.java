
/*
    Take N as input. print from 1 to N
    Input : 5
    Output : 1 2 3 4 5

 */


package ForLoop.ClassCodes;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int N = Integer.parseInt(br.readLine());

        for(int i=1;i<=N;i++){

            System.out.print(i+" ");
        }
       
    }
}
