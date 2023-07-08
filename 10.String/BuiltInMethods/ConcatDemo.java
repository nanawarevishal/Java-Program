
/*
 Method:Public String concat(String str);
    description:
        1)concatinate String to this String i.e Another String isconcatinated with the first string.
        2)Implements new Array of character whose length is sum str1.length and str2.length 
 */


package BuiltInMethods;

public class ConcatDemo {
    public static void main(String[] args) {
        String str1 = "Core2";
        String str2 = "Web";

        String str3 = str1.concat(str2);
        System.out.println(str3);
    
        

    }
}
