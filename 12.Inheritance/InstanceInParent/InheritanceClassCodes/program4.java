package InstanceInParent.InheritanceClassCodes;

class Parent4{

    int x =10;
    Parent4(){
        System.out.println("In Parent Constructor");
    }

    void access(){
        System.out.println("Parent method");
    }
}

class child4 extends Parent4{
    int y = 20;
    int x =90;
    child4(){

        System.out.println("In child Constructor");
        System.out.println(x);
        System.out.println(y);

    }
}

class client4{
    public static void main(String[] args) {
        child4 obj = new child4();
        obj.access();
        

    }
}
