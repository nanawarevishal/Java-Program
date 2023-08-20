package MethodLocalIC;

class Outer3{

    Object fun(){
        System.out.println("In Outer fun");

        class Inner3{

            void fun(){
                System.out.println("Inner fun");
            }

        }

        return new Inner3();
    }

    void gun(){
        System.out.println("Outer gun");
    }
}

class Client3{

    public static void main(String[] args) {
        
        Outer3 obj = new Outer3();
        obj.fun().fun();  // object class parent of all other classes directly or indirectly
    }
}


/*


 Output:
        .\3_Method.java:29: error: cannot find symbol
        obj.fun().fun();  // object class parent of all other classes directly or indirectly
                        ^
        symbol:   method fun()
        location: class Object
        1 error

        
 */