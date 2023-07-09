package UserDefineMethods;

public class charAtDemo {

    static char charAt(int index,String str){
        char ch[] = str.toCharArray();
        return ch[index];
    }
    
    public static void main(String[] args) {
        String str = "Core2Web";
        System.out.println(str.charAt(7));
        System.out.println(charAt(7, str));
    }
}
