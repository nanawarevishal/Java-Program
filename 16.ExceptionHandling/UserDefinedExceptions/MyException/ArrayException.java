package UserDefinedExceptions.MyException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DataOverflowException extends RuntimeException{
    DataOverflowException(String msg){
        super(msg);
    }   
}

class DataUnderflowException extends RuntimeException{
    DataUnderflowException(String msg){
        super(msg);
    }
}

class ArrayException{
    public static void main(String[] args)throws IOException {
        
        int[] arr = new int[5];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter integer value: ");
        System.out.println("Note: 0 < element < 100");
        
        for(int i=0;i<arr.length;i++){
            int data = Integer.parseInt(br.readLine());

            if(data<0){
                throw new DataUnderflowException("Data should be greater than zero");
            }
            
            if(data>100){
                    throw new DataOverflowException("Data should be less than 100");
            }

            arr[i] = data;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}