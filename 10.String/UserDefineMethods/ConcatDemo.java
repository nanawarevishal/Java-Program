package UserDefineMethods;

public class ConcatDemo {
    static String concat(String str1,String str2){
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        char ch3[] = new char[ch1.length+ch2.length];

        for(int i=0;i<ch1.length;i++){
            ch3[i] = ch1[i];
        }

        int x =0;
        for(int i=ch1.length;i<ch3.length;i++){
            ch3[i] = ch2[x];
            x++;
        }

        String str = new String(ch3);
        return str;
    }
    public static void main(String[] args) {
        String str1 = "Core";
        String str2 = "2Web";

        System.out.println(concat(str1, str2));
    }
}
