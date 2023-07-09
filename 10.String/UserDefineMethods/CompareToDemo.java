package UserDefineMethods;

public class CompareToDemo {

    static int compareTo(String str1, String str2) {

        int len = Math.min(str1.length(), str2.length());

        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }

        if (str1.length() != str2.length()) {
            return str1.length() - str2.length();
        }
        return 0;
    }

    static int myCompareTo(String str1, String str2) {

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        int diff = 0;
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 == len2) {

            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) {

                    diff = arr1[i] - arr2[i];
                    break;
                }
            }

        } else {

            diff = len1 - len2;
        }
        return diff;

    }

    public static void main(String[] args) {

        String str1 = "Core2Web";
        String str2 = "Core2web";

        System.out.println(compareTo(str1, str2));
        System.out.println(myCompareTo(str1, str2));
        System.out.println(str1.compareTo(str2));

        String str3 = "ABC";
        String str4 = "XYZ";

        System.out.println(compareTo(str3, str4));
        System.out.println(myCompareTo(str3, str4));
        System.out.println(str3.compareTo(str4));

        String str5 = "Core";
        String str6 = "Core2Web";

        System.out.println(compareTo(str5, str6));
        System.out.println(myCompareTo(str5, str6));
        System.out.println(str5.compareTo(str6));

        String str7 = "Core";
        String str8 = "Core2Web";

        System.out.println(compareTo(str8, str7));
        System.out.println(myCompareTo(str8, str7));
        System.out.println(str8.compareTo(str7));

        String str9 = "Core2web";
        String str0 = "Core2Web";

        System.out.println(compareTo(str9, str0));
        System.out.println(myCompareTo(str9, str0));
        System.out.println(str9.compareTo(str0));
    }
}
