package MethodOverriding;

class Demo13{

    void fun(float ch){
        System.out.println("Char Para");
    }

    void fun(int x){
        System.out.println("Int Para");
    }
}

class Client13{
    public static void main(String[] args) {
        Demo13 obj = new Demo13();
        obj.fun(13.4);
    }
}


/*

 Output:
        .\13_MethodOverloadingScene.java:20: error: no suitable method found for fun(double)
        obj.fun(13.4);
           ^
        method Demo13.fun(float) is not applicable
        (argument mismatch; possible lossy conversion from double to float)
        method Demo13.fun(int) is not applicable
        (argument mismatch; possible lossy conversion from double to int)  
    1 error
    
 */
