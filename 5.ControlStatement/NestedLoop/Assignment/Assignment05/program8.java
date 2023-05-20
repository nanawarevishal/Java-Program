
/*
 Q8
        write a program to print the following pattern
        Row =8
        $
        @ @
        & & &
        # # # #
        $ $ $ $ $
        @ @ @ @ @ @
        & & & & & & &
        # # # # # # # #
 */



package NestedLoop.Assignment.Assignment05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program8 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");

        int row = Integer.parseInt(br.readLine());

        for (int i = 1; i <= row*2; i++) {

            for (int j = 1; j <= i; j++) {

                if(i%row==1){
                    System.out.print("$ ");
                }
                
                else if(i%row==2){
                    System.out.print("@ ");
                }
                
                else if(i%row==3){
                    System.out.print("& ");
                }

                else{
                    System.out.print("# ");
                }

            }

            System.out.println();

        }
    }
}
