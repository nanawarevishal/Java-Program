package UserDefineMethods;

public class LengthDemo {

    static int length(String str){
        char ch[] = str.toCharArray();

        int count=0;
        for(char ch1:ch){
            count++;
        }
        
        return count;
        
    }
    public static void main(String[] args) {
        String str = "Core2Web";

        System.out.println(length(str));
        
    }
}
