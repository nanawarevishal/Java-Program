package BuiltInMethods;

public class compareTOIngnoreCaseDemo {
    public static void main(String[] args) {
        String str1 = "Core2Web";
        String str2 = "core2web";

        System.out.println(str1.compareToIgnoreCase(str2));

        String str3 = "SHAShi";
        String str4 = "sheshikant";

        System.out.println(str3.compareToIgnoreCase(str4));
        
    }
}
