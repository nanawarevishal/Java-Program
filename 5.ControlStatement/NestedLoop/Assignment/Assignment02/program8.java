

/*
 write a program to print the following pattern
A b C d
E f G h
I j K l
M n O p
 */


package NestedLoop.Assignment.Assignment02;

public class program8 {

    public static void main(String[] args) {
        
        char ch = 'A';
        char ch1 = 'a';

        int row=4;

        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                if(j%2==0){
                    System.out.print(ch1+" ");
                }
                else{
                    System.out.print(ch+" ");
                }

                ch++;
                ch1++;
            }
            System.out.println();
        }
    }
    
}
