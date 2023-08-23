package TryCatchFinally.TryCatchBlock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NumberFormatExcept{

    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x =0;
        try {

            // br.close();
            
            x = Integer.parseInt(br.readLine());
            
        }catch(IOException e){
            System.out.println("IO Exception");
        }
         catch (NumberFormatException e) {
            System.out.println("Number format Exception Occured...!");

        }catch(NullPointerException e){
            System.out.println("Null poiter Exception");
        }catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println(x);
    }
}
