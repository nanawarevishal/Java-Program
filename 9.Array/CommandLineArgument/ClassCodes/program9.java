package CommandLineArgument.ClassCodes;



public class program9 {
    
    static void fun(int x,int y){
        x = x+10;
        y = y+20;

        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        int x = 10;
        int y =20;

        fun(x,y);

        System.out.println(x);
        System.out.println(y);


    }
}
