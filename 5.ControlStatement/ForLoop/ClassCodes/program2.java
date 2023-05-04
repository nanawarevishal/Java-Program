
/*
  Take N as input. Print odd integers from 1 to N
  Input : 6
  Output : 1 3 5
 */



package ForLoop.ClassCodes;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int N = Integer.parseInt(br.readLine());

        for(int i=1;i<=N;i++){

            if(i%2==1){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        //Second Approach

        for(int i=1;i<=N;i=i+2){
            System.out.print(i+" ");
        }

    }
}
