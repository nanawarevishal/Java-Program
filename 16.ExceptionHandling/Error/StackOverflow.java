package Error;


class stackDemo{

    static void fun(int x){
        System.out.println(x);
        fun(++x);
    }
    public static void main(String[] args) {
        // fun(1);

    try {
        fun(1);
    } catch (StackOverflowError  e) {
       System.out.println("StackOverflow ....!");
    }
    }
}