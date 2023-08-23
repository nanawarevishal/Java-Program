package UserDefinedExceptions.ThrowClause;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArithmeticExcept{

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        try{

            if(x==0){
                throw new ArithmeticException("Divide by zero"); // to throw the user-defined exceptions
            }
        }catch(ArithmeticException e){
            System.out.print("Exception in thread "+Thread.currentThread().getName()+" ");
            e.printStackTrace();
        }
    }
}
