package NormalIC;


class Outer6{
    
    class Inner6{

        void m1(){

            System.out.println("Inner M1");
        }
    }

    void m2(){
        // Inner6 obj = new Inner6();
        // obj.m1();
        System.out.println("Outer M2");
    }

    public static void main(String[] args) {
        Inner6 obj = new Inner6();
        obj.m1();
    }
}


/*

 Output:
        .\6_Normal.java:19: error: non-static variable this cannot be referenced from a static context
        Inner6 obj = new Inner6();
                     ^
        1 error

 */