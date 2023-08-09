package Interface;

interface parent17{
    static void fun(){
        System.out.println("In Fun parent");
 
    }
}

class child17 implements parent17{
    // void fun(){

    // }
}

class client17 {

    public static void main(String[] args) {
        child17 obj = new child17();
        obj.fun();

        parent17 obj1 = new child17();
        obj1.fun();

    }
}


/*

Explanation:
            static method cann't comes in child class;

 Output:
        .\17_interfaceStaticScene.java:18: error: cannot find symbol
        obj.fun();
           ^
        symbol:   method fun()
        location: variable obj of type child17


        .\17_interfaceStaticScene.java:21: error: illegal static interface method call 
                obj1.fun();
                        ^
        the receiver expression should be replaced with the type qualifier 'parent17'

2 errors

 */