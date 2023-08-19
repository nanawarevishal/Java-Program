package NormalIC;

class Outer9{

    int x = 10;
    int y = 20;
    
    void m1(){

        int a =30;
        // static int b =30;  Error
        // final static int b =30;   Error
    }

    public static void main(String[] args) {
        int p = 50;
        // static int q = 60;   Error

    }
}
