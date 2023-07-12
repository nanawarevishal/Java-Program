package Quiz.Quiz1;

public class program10 {
    public static void main(String[] args) {
        String str1 = new String("core2web");
        String str2 = new String("core2web");

        if(str1==str2){
            System.out.println("True 1");
        }

        if(str1.equals(str2)){
            System.out.println("True 2");
        }

        if(str1.hashCode()==str2.hashCode()){
            System.out.println("True 3");
        }
    }
}
