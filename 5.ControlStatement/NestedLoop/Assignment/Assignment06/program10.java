

/*


        Q10
        Write a program to take range as input from the user and print Armstrong numbers. ( Take a start and
        end number from a user )
        Input: Enter start: 1
        Enter end: 1650
        Output: Armstrong numbers between 1 and 1650
        1 2 3 4 5 6 7 8 9 153 370 371 407 1634


 */



package NestedLoop.Assignment.Assignment06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start and end: ");

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        for (int i = start; i <= end; i++) {

            int temp = i;
            int temp1 = i;
            int cnt=0;
            while(temp1!=0){
                temp1/=10;
                cnt++;
            }
            int sum = 0;
            while (temp != 0) {
                int rem = temp % 10;
                int fact = 1;
                for (int j = 1; j <= cnt; j++) {
                    fact = fact * rem;
                }

                sum += fact;
                temp /= 10;
            }

            if (i == sum)
                System.out.print(sum + " ");
        }
    }
}
