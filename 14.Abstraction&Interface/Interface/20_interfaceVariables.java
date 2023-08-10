package Interface;

interface parent20{

    int x =10;
    void fun();
}


interface p{
    int x =20;
}


class child20 implements parent20,p{

    int x =30;
    public void fun(){
        System.out.println(x);
        System.out.println(p.x);
        System.out.println(parent20.x);
    }
}


class Client20{
    public static void main(String[] args) {
        parent20 obj = new child20();
        obj.fun();
    }
}
