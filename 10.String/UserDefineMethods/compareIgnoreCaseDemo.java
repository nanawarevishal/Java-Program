package UserDefineMethods;

public class compareIgnoreCaseDemo {

    static int CompareToIgnoreCaseDemo(String str1,String str2){

        int len = Math.min(str1.length(),str2.length());
        if(str1.length()!=str2.length()){
            return str1.length()-str2.length();
        }

        for(int i=0;i<len;i++){
            if(str1.charAt(i)==(str2.charAt(i)+32) || (str1.charAt(i)+32) ==str2.charAt(i)){
                continue;
            }
            else{
                if(str1.charAt(i)<str2.charAt(i) && str2.charAt(i)>90){
                    return str1.charAt(i)-str2.charAt(i)-32;
                }

                else if(str1.charAt(i)>str2.charAt(i) && str1.charAt(i)>90){
                    return str1.charAt(i)-32 - str2.charAt(i);
                }

                else{
                    return str1.charAt(i)-str2.charAt(i);
                }
            }
        }

        return 0;
        
    }

    public static void main(String[] args) {
        String str1 = "Core2Web";
        String str2 = "core2web";

        System.out.println(CompareToIgnoreCaseDemo(str1, str2));
        System.out.println(str1.compareToIgnoreCase(str2));

        String str3 = "abc";
        String str4 = "ABC";

        System.out.println(CompareToIgnoreCaseDemo(str3, str4));
        System.out.println(str3.compareToIgnoreCase(str4));
    }
}
