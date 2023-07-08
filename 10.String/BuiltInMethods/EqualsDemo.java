package BuiltInMethods;

public class EqualsDemo {
    public static void main(String[] args) {
        String str1 = "Core2Web";
        String str2 = "Core2Web";

        String str3 = new String("Core2Web");
        System.out.println(str1.equals(str3));
        
    }
}
