package Quiz.Quiz4;

public class program5 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Java_Virtual_Machine");
        str.setCharAt(str.charAt(14), 'z');

        System.out.println(str);
    }
}
