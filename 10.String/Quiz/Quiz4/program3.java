package Quiz.Quiz4;

public class program3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Builder");
        str.insert(5, new String("0"));
        str.reverse();
        System.out.println(str.reverse());
    }
}
