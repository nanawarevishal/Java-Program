package scopeOfVariables.ClassCodes;

import javax.sound.sampled.SourceDataLine;

public class program3 {
    public static void main(String[] args) {

        int x=10,y=20;
    {
        System.out.println(x+" "+y);
    }
    {
        x=15;
        System.out.println(x+" "+y);
    }

    System.out.println(x+" "+y);
        
    }
    
}


