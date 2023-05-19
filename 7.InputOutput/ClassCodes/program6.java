package ClassCodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program6 {

    public static void main(String[] args)throws IOException {


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println(num);

    }
}