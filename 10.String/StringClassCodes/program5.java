package StringClassCodes;

public class program5 {
    public static void main(String[] args) {
        String str1 = "Rahul";
        String str2 = "Sharma";

        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));

        String str3 = "RahulSharma";
        String str4 = str1.concat(str2);

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
