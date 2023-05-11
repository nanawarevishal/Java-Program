
/*
 write a program to print the following pattern

F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
 */


package NestedLoop.Assignment.Assignment02;

public class program10 {

    public static void main(String[] args) {
        
        int row=6;
        for(int i=1;i<=row;i++){

            char ch =(char)(64+row);
            int n = row;
            for(int j=1;j<=row;j++){

               if(j%2==1){
                System.out.print(ch+" ");
               }
               else{
                System.out.print(n+" ");
               }
               ch--;
               n--;
            }
            System.out.println();
        }
    }  
}
