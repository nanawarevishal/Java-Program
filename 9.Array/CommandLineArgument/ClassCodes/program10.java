package CommandLineArgument.ClassCodes;

public class program10 {

    static void fun(int a[]){

        System.out.println("The address of the array in fun"+a);
        for(int x:a){
            System.out.print(x+" ");
        }
        
        System.out.println("\nAfter change in fun");
        
        for(int i=0;i<a.length;i++){
            a[i]= a[i]+50;
        }
        System.out.println("The address of the array in fun"+a);
    }


    public static void main(String[] args) {
        
        int arr[] ={10,20,30};

        System.out.println("The address of the array before"+arr);

        fun(arr);

        System.out.println("\nAfter function call");

        for(int x : arr){
            System.out.print(x+" ");
        }

        System.out.println("The address of the array after"+arr);
    }
}
