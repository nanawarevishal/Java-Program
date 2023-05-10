

/*
 write a program to print the following pattern
12 12 12
11 11 11
10 10 10
 */



package NestedLoop.Assignment.Assignment01;

public class program5 {

    public static void main(String[] args) {
        
        int row = 3;

        int n=12;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){
                System.out.print(n+" ");
            }
            n--;
            System.out.println();
        }
    }
    
}
