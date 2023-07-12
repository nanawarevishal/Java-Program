package Quiz.Quiz1;

public class program9 {
    public static void main(String[] args) {
        String var1 = "This is a string";
        String var2 = "a string";
        String var3 = "This is "+var2;

        if(System.identityHashCode(var3)==System.identityHashCode(var1)){
            System.out.println("equal");
        }

        else{
            System.out.println("Not equal");
        }
    }
}
