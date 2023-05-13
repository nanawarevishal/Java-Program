
/*
 125. Valid Palindrome
                Easy
                6.7K
                7K
                Companies
                A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

                Given a string s, return true if it is a palindrome, or false otherwise.

                

                Example 1:
                Input: s = "A man, a plan, a canal: Panama"
                Output: true
                Explanation: "amanaplanacanalpanama" is a palindrome.

                Example 2:
                Input: s = "race a car"
                Output: false
                Explanation: "raceacar" is not a palindrome.

                Example 3:
                Input: s = " "
                Output: true
                Explanation: s is an empty string "" after removing non-alphanumeric characters.
                Since an empty string reads the same forward and backward, it is a palindrome.

 */


package LeetCode_String;

public class program5 {

    static boolean isPalindrome(String s) {

        boolean flag = true;

        s = s.replaceAll(
            "[^a-zA-Z0-9]", "");

        System.out.println(s);
        s =s.toLowerCase();
        System.out.println(s);

        int left = 0;
        int right = s.length()-1;

        while(left < right){

            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return flag;
        
    }

    public static void main(String[] args) {

        String str = "race a car";

        System.out.println(isPalindrome(str));
        
    }
    
}
