
/*
Real Time Example:

            1.Unsuffiecient Money Exception
            2.UserNotFoundException

 */



package UserDefinedExceptions.MyException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HighBPShootException extends RuntimeException{

    HighBPShootException(String msg){
        super(msg);
    }
}


class LowerBPShootException extends RuntimeException{

    LowerBPShootException(String msg){
        super(msg);
    }
}


class BPShootException{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the BP Reading: ");
        int BPReading = Integer.parseInt(br.readLine());

        if(BPReading <70){
            throw new LowerBPShootException("Lower BP");
        }

        if(BPReading >140){
            throw new LowerBPShootException("Higher BP");
        }

        System.out.println(BPReading);
    }
}
