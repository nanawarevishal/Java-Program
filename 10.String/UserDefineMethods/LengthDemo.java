package UserDefineMethods;

public class LengthDemo {

    static int length(String str){
        char ch[] = str.toCharArray();
        
        return ch.length;
        
    }
    public static void main(String[] args) {
        String str = "Core2Web";

        System.out.println(length(str));
        
    }
}
