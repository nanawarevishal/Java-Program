package Quiz.Quiz3;

public class program9 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("core2web");

        long v1 = System.identityHashCode(s1);

        s1.append(s1);
        long v2 = System.identityHashCode(s1);

        if(v1==v2){
            System.out.println("true");
        }

        else{
            System.out.println("false");
        }
    }
}
