
package ClassCodes;

public class program1 {

    int x =10;
    static void fun(){
        System.out.println("Inside Fun method...!");
    }

    void gun(){
        System.out.println("Inside gun method..!");
        fun();
    }

    public static void main(String[] args) {
        
        program1 obj = new program1();

        gun();
    }
}



/*

        program1.java:20: error: non-static method gun() cannot be referenced from a static context
                gun();
                ^
        1 error
        error: compilation failed
        
 */
