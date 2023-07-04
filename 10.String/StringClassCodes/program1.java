package StringClassCodes;

public class program1 {
    public static void main(String[] args) {
       
        String str1 = "abc";
        String str2 = "pqr";

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        char ch3[] = new char[ch1.length+ch2.length];

        for(int i=0;i<ch1.length;i++){
            ch3[i] = ch1[i];
        }

        int x=0;
        for(int j=ch1.length;j<ch3.length;j++){
            ch3[j]= ch2[x];
            x++;
        }

        for(int i=0;i<ch3.length;i++){
            System.out.println(ch3[i]);
        }

        String str3  = ch3.toString();
        System.out.println(str3);

        System.out.println(ch3);

        
    }
}
