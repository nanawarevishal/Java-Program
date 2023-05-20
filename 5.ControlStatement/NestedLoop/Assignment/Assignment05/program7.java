

/*
        Q7
        write a program to print the following pattern
        Row =5;
        O
        14 13
        L K J
        9 8 7 6
        E D C B A

        Row = 4
        10
        I H
        7 6 5
        D C B A

 */


 package NestedLoop.Assignment.Assignment05;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 
 
 public class program7 {
     public static void main(String[] args)throws IOException {
         
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
         System.out.println("Enter the number of rows: ");
 
         int row = Integer.parseInt(br.readLine());
        
         int num = row*(row+1)/2;
         char ch = (char)(64+num);

         for(int i=1;i<=row;i++){
 
             for(int j=1;j<=i;j++){
 
                 if(i%2==1){
                     System.out.print(ch+" ");
                 }
 
                 else{
                     System.out.print(num+" ");
                 }
                 ch--;
                 num--;
                
             }
 
             System.out.println();
    }

    num = row*(row+1)/2;

    ch = (char )(64+num);
    for(int i=1;i<=row;i++){

        for(int j=1;j<=i;j++){

            if(i%2==0){
                System.out.print(ch+" ");
            }

            else{
                System.out.print(num+ " ");
            }

            ch--;
            num--;
        }
        System.out.println();
    }
  }
}
