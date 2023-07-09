package UserDefineMethods;

public class ToCharArray {

    static char[] toCharArray(String str1){
        char ch[] = new char[str1.length()];

        for(int i=0;i<str1.length();i++){
            ch[i] = str1.charAt(i);
        }

        // System.out.println(ch.getClass().getName());

        return ch;
    }

    public static void main(String[] args) {
        String str1 = "Core2Web";

        char ch[] = toCharArray(str1);
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
            
        }
    }
}
