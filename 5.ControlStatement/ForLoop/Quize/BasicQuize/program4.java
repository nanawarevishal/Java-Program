package ForLoop.Quize.BasicQuize;

import javax.sound.sampled.SourceDataLine;

public class program4 {
    public static void main(String[] args) {
        
        for(int var1=10;System.out.println(var1);var1++){
            if(var1==12){
                System.out.println(var1);
            }
        }
    }
}


/*
        program4.java:8: error: incompatible types: void cannot be converted to boolean
                for(int var1=10;System.out.println(var1);var1++){
                                                ^
        1 error
        error: compilation failed


        Explanation - In for loop, the condition statement must be a boolean value.
 */