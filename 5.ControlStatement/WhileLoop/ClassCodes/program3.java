
/*
 Take an integer N as input
 print odd integers from 1 to N using loop

  input:10
  output : 1,3,5,7,9

 */ 


package WhileLoop.ClassCodes;

public class program3 {
    public static void main(String[] args) {

        int n=10;
        int i=1;

        while(i<=n){

            if(i%2==1)
            {
                System.out.print(i+" ");
            }

            i++;
            
        }
        
    }
}
