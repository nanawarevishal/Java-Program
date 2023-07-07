package StringClassCodes;

public class program7 {
    public static void main(String[] args) {
        String str = "Rahul";
        String str2 = new String("Rahul");

        if(str==str2){
            System.out.println("Equal");
        }

        // if(str.equals(str2)){
        //     System.out.println("Equal");
        // }

        else{
            System.out.println("Not Equal");
        }
    }
}

/*
 Explanation :
    
    '==' it will check identityhashCode here
 */
