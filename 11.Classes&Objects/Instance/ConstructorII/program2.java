package Instance.ConstructorII;

class Demo2{

    static int y =20;
    int x = 10;

    static{
        System.out.println("In static block");
    }

    Demo2(){
        System.out.println("In Constructor");
        System.out.println("X: "+x);
    }

    public static void main(String[] args) {
        
    }
}