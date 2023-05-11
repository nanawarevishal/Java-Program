
/*
 write a program to print the following pattern
        26 Z 25 Y
        24 X 23 W
        22 V 21 U
        20 T 19 S
 */


package NestedLoop.Assignment.Assignment02;

public class program5 {

    public static void main(String[] args) {
        
        int row=4;
        
        int N = 26;
        char ch = 'Z';
        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                if(j % 2==1){
                    System.out.print(N--+" ");
                }
                else{
                    System.out.print(ch--+" ");
                }

            }

            System.out.println();
        }
    }
    
}
