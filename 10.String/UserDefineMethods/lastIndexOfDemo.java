package UserDefineMethods;

public class lastIndexOfDemo {

    static int lastIndexOf(char ch,int upToIndex,String str ){
        for(int i=upToIndex;i>=0;i--){
            if(str.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = "Core2Web";

        System.out.println(str1.lastIndexOf('e', 6));
        System.out.println(lastIndexOf('e', 6, str1));
        
    }
}
