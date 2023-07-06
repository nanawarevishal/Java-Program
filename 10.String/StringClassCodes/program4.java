package StringClassCodes;

public class program4 {
    public static void main(String[] args) {
        
        String str1 = "Kanha";
        System.out.println(System.identityHashCode(str1));
        str1 = str1+"Rahul";
        System.out.println(System.identityHashCode(str1));


    }
}
