package Quiz.Quiz4;

public class program1 {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("StringBuilder");
        StringBuffer str2 = new StringBuffer(str1.substring(6));

        System.out.println(str2);
    }
}
