
/*
 557. Reverse Words in a String III
                Easy
                4.8K
                226
                Companies
                Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

            
                Example 1:
                Input: s = "Let's take LeetCode contest"
                Output: "s'teL ekat edoCteeL tsetnoc"


                Example 2:
                Input: s = "God Ding"
                Output: "doG gniD"

 */



package LeetCode;

public class program56 {
    static String reverseWords(String s) {

        String str = "";

        String a[] = s.split(" ");

        for(int i=0;i<a.length;i++){
            
            String b = a[i];

            for(int j=b.length()-1;j>=0;j--){
                
                str += b.charAt(j);
            }
            str+=" ";
        }


        return str;
        
        
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String str = reverseWords(s);
        System.out.println(str);
    }
}
