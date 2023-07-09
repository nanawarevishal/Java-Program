package UserDefineMethods;

public class indexOfDemo {
    static int indexOf(char ch,int fromIndex,String str){

        char ch1[] = str.toCharArray();
        for(int i=fromIndex;i<ch1.length;i++){
            if(ch1[i]==ch){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = "Core2Web";
        System.out.println(indexOf('o', 0,str1));
        System.out.println(str1.indexOf('o', 0));
    }
}
