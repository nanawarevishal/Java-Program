package StringClassCodes;

public class program3 {
    public static void main(String[] args) {
        String str1="Abc";
        String str2 = str1;

        String str3 = new String(str2);

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));

    }
    
}
