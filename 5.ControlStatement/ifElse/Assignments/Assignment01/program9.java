/*
    Program 9: Write a program in java to accept three numbers and check whether they
    are Pythagorean triplets or not
    example (what is a Pythagorean triplet):
    a=3,b=4,c=5
    if
    a*a+b*b=c*c
    then
    its pythagorean triplet
    else
    not a Pythagorean triplet
    input1:
    a=3,b=4,c=5
    Output: it is a Pythagorean triplet
    input2:
    a=1, b=6,c=9
    Output: It is not a Pythagorean triplet
    input3:
    a=2, b=2,c=2
    Output: ?????
 */


package Assignment01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program9 {

    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number1: ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter the number2: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Enter the number3: ");
        int c = Integer.parseInt(br.readLine());

        if(a*a + b*b ==c*c || a*a == b*b +c*c ||b*b == a*a +c*c){
            System.out.println("It's Pythagorean triplet.");
        }

        else {
            System.out.println("It's not Pythagorean triplet.");
        }
    }
}
