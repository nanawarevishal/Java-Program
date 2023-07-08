package BuiltInMethods;

public class CompareToDemo {
    public static void main(String[] args) {
        String str1 = "Core2Web";
        String str2 = "Core2web";

        System.out.println(str1.compareTo(str2));


        String str3 = "ABC";
        String str4 ="XYZ";

        System.out.println(str3.compareTo(str4));


        String str5 = "Core";
        String str6 = "Core2Web";

        System.out.println(str5.compareTo(str6));

        String str7 = "Core";
        String str8 = "Core2Web";

        System.out.println(str8.compareTo(str7));
    }
}
