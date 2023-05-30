package ForEachLoop.classCodes;

public class program1 {
    public static void main(String[] args) {
        float arr[] = {10,20,30,40,50};

        for(int data : arr){
            System.out.print(data+" ");

            if(data == 40){
                break;
            }
        }
    }
}


/*
    .\program1.java:7: error: incompatible types: possible lossy conversion from float to int
            for(int data : arr){
                        ^    
    1 error
    error: compilation failed
 */
