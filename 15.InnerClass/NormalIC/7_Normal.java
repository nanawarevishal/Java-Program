package NormalIC;

class Outer7{

    private int x =10;

    Outer7(){

    }



    class Inner7{

        int x =90;


        Inner7(int x){
            System.out.println(x);
        }

        Inner7(){
            System.out.println("Inner this reference: "+this);
            System.out.println("Outer this reference: "+Outer7.this);
            System.out.println("Outer class variable: "+Outer7.this.x);
            System.out.println(x);
        }

        void fun2(){
            
            System.out.println("Inner fun");
        }

    }

    void fun1(){
        System.out.println("Outer fun");
    }
}

class client7{

    public static void main(String[] args) {

        Outer7 obj1 = new Outer7();
        System.out.println("Outer obj: "+obj1);
        Outer7.Inner7 obj =obj1.new Inner7();

        System.out.println("Inner obj: "+obj);
        
    }
}