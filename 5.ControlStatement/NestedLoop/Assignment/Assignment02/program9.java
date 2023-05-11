
/*
 write a program to print the following pattern
1C3 4B2 9A1
16C3 25B2 36A1
49C3 64B2 81A1
 */



package NestedLoop.Assignment.Assignment02;

public class program9 {

    public static void main(String[] args) {
        
        int row=3;
        int n1 = 1;

        for(int i=1;i<=row;i++){
            int n2 = 3;
            char ch ='C';
            for(int j=1;j<=row;j++){

                System.out.print((n1*n1));
                System.out.print(ch--);
                System.out.print((n2--+" "));
                n1++;
            }
            System.out.println();
        }
    }
    
}
