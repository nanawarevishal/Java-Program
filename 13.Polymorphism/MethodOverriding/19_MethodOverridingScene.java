package MethodOverriding;

class Parent19{

    int fun(){
        System.out.println("In Parent fun");
        return 0;
    }
}

class child19{

     void marry(){
        System.out.println("Child selected Girl");
    }

    float fun(){
        System.out.println("In child fun");
        return 0.0f;
    }

}

class Client19{
    public static void main(String[] args) {
        Parent19 obj = new child19();
        obj.fun();
    }
}


/*

Output:  
        .\19_MethodOverridingScene.java:26: error: incompatible types: child19 cannot be converted to Parent19
        Parent19 obj = new child19();
                       ^
        1 error

 */
