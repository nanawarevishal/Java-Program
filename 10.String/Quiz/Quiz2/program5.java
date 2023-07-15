package Quiz.Quiz2;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class program5 {
    public static void main(String[] args) {
        String s1 = new String("core2web");
        String s2 = new String("core2web");

        if(System.identityHashCode(s1).equals(System.identityHashCode(s2))){
            System.out.println("True");
        }

        else{
            System.out.println("false");
        }
    }
}
