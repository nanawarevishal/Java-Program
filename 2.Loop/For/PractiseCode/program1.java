// Program 1 : LCM (Latest Commom Multiple) of two number


package For.PractiseCode;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program1 {
    public static void main(String[] args)throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the 1st number ");
		int num1 = Integer.parseInt(br.readLine());

        System.out.println("Enter the 2st number ");
		int num2 = Integer.parseInt(br.readLine());

        int cmnDiv= 0;
        for(int i = 1; i <= num1 || i <= num2; i++){
			
			if(num1 % i == 0 && num2 % i == 0){
				
				cmnDiv = i;
			}
		
		}
		int lcm = (num1 * num2) / cmnDiv;
		System.out.println("LCM of "+ num1 + " and "+ num2 + " is " + lcm);
    }
    
}
