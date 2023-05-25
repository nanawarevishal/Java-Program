package ClassCodes;

public class methodDemo10 {

    fun(){
        System.out.println("In fun..!");
        System.out.println();
    }
    public static void main(String[] args) {
        
        methodDemo10 obj = new methodDemo10();

        obj.fun();

    }
}


/*

            methodDemo10.java:5: error: invalid method declaration; return type required
            fun(){
            ^     
        1 error
        error: compilation failed

 */