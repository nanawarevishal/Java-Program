/*
    Program 8: Write a program to check day number(1-7) and print the corresponding
    day of week
    Input1 : 1
    Output: Monday
    Input2: 6
    Output: Saturday
    Input3: 8
    Output: ????????

 */


package Assignment01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program8 {

    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the day of Week: ");
        int day = Integer.parseInt(br.readLine()); 

        if(day==1){
            System.out.println("Monday");
        }

        else if(day==2){
            System.out.println("Tuesday");
        }

        else if(day==3){
            System.out.println("Wednesday");
        }

        else if(day==4){
            System.out.println("Thursday");
        }

        else if(day==5){
            System.out.println("Friday");
        }

        else if(day==6){
            System.out.println("Saturday");
        }

        else if(day==7){
            System.out.println("Sunday");
        }

        else{
            System.out.println("Invalid Input...!");
        }
    }
}
