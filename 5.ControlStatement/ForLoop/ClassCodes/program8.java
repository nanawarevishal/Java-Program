package ForLoop.ClassCodes;

public class program8 {

    public static void main(String[] args) {
        int x=10;

        for(int i=1;i<=10;i++);{
            System.out.println(x+i);   

        }
    }
}

/*

 program8.java:8: error: cannot find symbol
            System.out.println(x+i);   //
                                 ^       
            symbol:   variable i
            location: class program8
            1 error
            error: compilation failed  // Compile time error

 */
