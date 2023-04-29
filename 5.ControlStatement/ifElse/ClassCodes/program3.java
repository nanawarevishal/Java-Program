
/*
 Given the temperature of a person in farenheit.
 Print whether the person has high,normal,low temperature. 

 >98.6              --High
 98.0 <= and <=98.6 --Normal

 <98.0              --low
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program3 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the temperature: ");
        float temp = Float.parseFloat(br.readLine());

        if(temp > 98.6f){

            System.out.println("High fever");
        }

        else if(temp >=98.0f && temp <=98.6f){
            System.out.println("Normal fever");
        }

        else if(temp <98.0f){
            System.out.println("Low fever");
        }
    }
}
