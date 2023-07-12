package Quiz.Quiz1;

public class program8 {
    public static void main(String[] args) {
        String var1 = "This is string";
        String var2 = "This is string";

        if(System.identityHashCode(var1)==System.identityHashCode(var2)){
            System.out.println("equal");
        }

        else{
            System.out.println("Not equal");
        }
    }
}
