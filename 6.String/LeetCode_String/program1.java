
/*
 Input : str = "abaab"
Output: 3
Explanation : 
All palindrome substring are :
 "aba" , "aa" , "baab" 

Input : str = "abbaeae"
Output: 4
Explanation : 
All palindrome substring are : 
"bb" , "abba" ,"aea","eae"
 */

package LeetCode_String;

import java.util.ArrayList;

public class program1 {
    static int noPalindrome(String str) {

        String s = "";

        ArrayList<String> st = new ArrayList<String>();

        for (int i = 0; i <= str.length(); i++) {

            for (int j = i + 2; j <= str.length(); j++) {

                st.add(str.substring(i, j));
            }

        }

        System.out.print(st + " ");

        int cnt = 0;
        for (int i = 0; i < st.size(); i++) {

            String substr = st.get(i);

            int left = 0;
            int right = substr.length() - 1;

            boolean flag = true;
            while (left < right) {

                if (substr.charAt(left) != substr.charAt(right)) {
                    flag = false;
                    break;
                }
                left++;
                right--;
            }
            if (flag) {

                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        String str = "abbaeae";
 
         System.out.println(noPalindrome(str));
    }

}