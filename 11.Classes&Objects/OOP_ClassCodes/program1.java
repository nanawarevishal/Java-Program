package OOP_ClassCodes;


class clsobj{

    int y = 20;
    static void fun(){
        int z = 30;
        System.out.println(System.identityHashCode(z));
        System.out.println(z);

    }
    
    public static void main(String[] args) {
        int x =10;
        System.out.println(System.identityHashCode(x));
        System.out.println(x);
        fun();  
    }
}

