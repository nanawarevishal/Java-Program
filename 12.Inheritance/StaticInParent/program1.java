package StaticInParent;

class Parent1{

    static int x =10;
}

class child1 extends Parent1{
    public static void main(String[] args) {
        System.out.println(Parent1.x);
    }
}
