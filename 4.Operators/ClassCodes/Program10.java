public class Program10 {
    public static void main(String[] args) {
        
        // Logical Operator

        int x =5;
        int y =7;

        // int ans = x && y; //This oprator works only on boolean value
                           // error: bad operand types for binary operator '&&'
                           // binary - 2 operand

        // int ans2 = x<y && y>x; //error: incompatible types: boolean cannot be converted to int

        // System.out.println(ans2);

        boolean ans1 = x<y || y>x;  //true
        // System.out.println(ans); 

        System.out.println(x<y && y>x);  //true

    }
}
