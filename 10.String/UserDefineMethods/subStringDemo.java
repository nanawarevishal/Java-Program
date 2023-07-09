package UserDefineMethods;

public class subStringDemo {
    
    static String subString(int beginIndex,String str){
        String str1 = "";

        for(int i=beginIndex;i<str.length();i++){
            str1 +=str.charAt(i);
        }

        return str1;
    }

    static String subString(int beginIndex,int endIndex,String str){
        String str1 = "";

        for(int i=beginIndex;i<endIndex;i++){
            str1 +=str.charAt(i);
        }
        return str1;
    }

    public static void main(String[] args) {
        String str1 = "Shashi";

        System.out.println(str1.substring(2));
        System.out.println(subString(10, str1));

        System.out.println(str1.substring(1, 5));
        System.out.println(subString(1, 5, str1));
    }
}
