package Interface;

public class program {
    public static void main(String[] args) {
        
        String str = "absc174fbbds45c897";
        int count = 0;
        int cnt = 0;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                while(i<str.length() && str.charAt(i)>=48 && str.charAt(i)<=57){
                    count++;
                    i++;
                }
                cnt++;

            }
        }

        System.out.println(count+cnt);
    }
}
