package RunTime;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

class NumberFormat{

    void getData()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int data = Integer.parseInt(br.readLine());
        System.out.println(data);
    }
    
    public static void main(String[] args)throws IOException {
        NumberFormat obj = new NumberFormat();
        obj.getData();                                    
    }
}


/*


Explanation:
        When we give the input other than the number in runtime.

Output:
        g
        Exception in thread "main" java.lang.NumberFormatException: For input string: "g"
            at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            at java.base/java.lang.Integer.parseInt(Integer.java:668)
            at java.base/java.lang.Integer.parseInt(Integer.java:786)
            at RunTime.NumberFormat.getData(1_NumberFormatException.java:12)
            at RunTime.NumberFormat.main(1_NumberFormatException.java:18)

 */
