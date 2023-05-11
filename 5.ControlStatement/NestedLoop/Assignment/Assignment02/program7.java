
/*
 write a program to print the following pattern
1 2 9
4 25 6
49 8 81
 */



package NestedLoop.Assignment.Assignment02;

public class program7 {

    public static void main(String[] args) {
        
        int row = 3;

        int n = 1;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                if(n%2==1){
                    System.out.print(n*n+" ");
                }
                else{
                    System.out.print(n+" ");
                }
                n++;
            } 
            
            System.out.println();
        }
    }
    
}
