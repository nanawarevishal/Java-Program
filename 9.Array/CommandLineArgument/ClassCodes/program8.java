package CommandLineArgument.ClassCodes;

public class program8 {

    static void fun(int xarr[]){
        for(int x:xarr){
            System.out.println(x);
        }

        xarr[0] =50;
    }
    public static void main(String[] args) {
        
        int arr[] ={10,20,30};
        for(int x:arr){
            System.out.println(x);
        }

        fun(arr);

        for(int x:arr){
            System.out.println(x);
        }

    }
}
