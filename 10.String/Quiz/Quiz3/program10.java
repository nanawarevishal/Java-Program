package Quiz.Quiz3;

public class program10 {
    public static void main(String[] args) {
        String s1 = "core2web";
        StringBuffer sb = new StringBuffer("core2web");
        if(s1.equals(sb)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
