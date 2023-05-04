package ForLoop.Quize.BasicQuize;

public class program8 {
    public static void main(String[] args) {
        int var1 =5;
        for(int i=1;i<=5;i++)
        System.out.println("i="+i);

        System.out.println("i="+i);
    }
}


/*

    Output:
        program8.java:9: error: cannot find symbol
                System.out.println("i="+i);
                                        ^
        symbol:   variable i
        location: class program8
        1 error
        error: compilation failed

    Explanation -Scope of i is limited to loop and we are trying to access i   outside loop, therefore error: cannot find symbol

 */
