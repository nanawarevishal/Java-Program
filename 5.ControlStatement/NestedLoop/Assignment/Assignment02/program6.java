
/*
 write a program to print the following pattern
1 4 9
16 25 36
49 64 81
 */


package NestedLoop.Assignment.Assignment02;

public class program6 {

    public static void main(String[] args) {
        
        int row =3;

        int n=1;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                System.out.print(n*n+" ");
                n++;
            }

            System.out.println();
        }
    }
    
    
}
