package Quiz.Quiz3;

public class program4 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer(400);
        str.append(400);
        str.setLength(str.length());
        System.out.println(str.capacity());
    }
}
