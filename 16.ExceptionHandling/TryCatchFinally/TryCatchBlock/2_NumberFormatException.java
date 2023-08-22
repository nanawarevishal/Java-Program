package TryCatchFinally.TryCatchBlock;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class NumberFormatExcept{

    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x =0;
        try {
            
            x = Integer.parseInt(br.readLine());
            
        } catch (NumberFormatException e) {
            System.out.println("Exception Occured...!");
        }

        catch(Exception e){
            System.out.println("Number format exception");
        }
        System.out.println(x);


    }
}
