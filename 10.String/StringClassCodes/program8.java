package StringClassCodes;

public class program8 {
    public static void main(String[] args) {
        String str1 = "Rahul";
        String str2 = "Sharma";

        String str3 = str1+str2;
        String str4 = str1.concat(str2);

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

    }
}
