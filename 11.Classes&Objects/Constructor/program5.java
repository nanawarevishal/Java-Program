package Constructor;


class parent{
    int z=10;

}

class ConstructorDemo extends parent{

    int x =10;

    ConstructorDemo(){

        System.out.println("In Constructor..!");
    }

    void fun(){
        System.out.println(super.z);
        ConstructorDemo obj = new ConstructorDemo();
    }

    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo();
        ConstructorDemo obj2 = new ConstructorDemo();

        obj1.fun();
    }
}
