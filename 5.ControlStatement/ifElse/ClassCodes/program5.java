
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        if(num % 2==1){
            System.out.println(num+" is odd");
        }

        else{
            System.out.println(num+" is even");
        }

        
    }
}
