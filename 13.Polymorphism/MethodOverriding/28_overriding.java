package MethodOverriding;

class Parent28{
    int x =10;

    static int y =20;

}

class Child28 extends Parent28{

    int x =90;

    static int y =30;
}

class Client28{

    public static void main(String[] args) {
        Parent28 obj = new Child28();
        System.out.println(obj.x);
        System.out.println(obj.y);
        
    }
}