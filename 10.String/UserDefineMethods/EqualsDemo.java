package UserDefineMethods;

public class EqualsDemo {

    static boolean equals(String str1,String str2){
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        if(ch1.length !=ch2.length){
            return false;
        }

        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "Core2web";
        String str2 = "Core2web";

        System.out.println(equals(str1, str2));
        
    }
}
