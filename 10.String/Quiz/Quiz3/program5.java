package Quiz.Quiz3;

public class program5 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("AndroidOne");
        str.delete(7, 10);
        str.insert(str.length(),true);
        System.out.println(str);
    }
}
