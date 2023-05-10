
/*
 write a program to print the following pattern
9 8 7
9 8 7
9 8 7
 */


 package NestedLoop.Assignment.Assignment01;

 public class program6 {
 
     public static void main(String[] args) {
         
         int row = 3;
 
         for(int i=1;i<=row;i++){
 
             int n = row*row;
             for(int j=1;j<=row;j++){
 
                 System.out.print(n+" ");
                 n--;
             }
             System.out.println();
         }
     }
     
 }