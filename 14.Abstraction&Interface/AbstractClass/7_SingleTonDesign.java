package AbstractClass;

class SingleTon{

    static SingleTon obj = new SingleTon();
    private SingleTon(){
        System.out.println("In Constructor");
    }

    static SingleTon getObject(){
        return obj;
    }
}

class Client{
    public static void main(String[] args) {
        SingleTon obj1 = SingleTon.getObject();
        System.out.println(obj1);

        SingleTon obj2 = SingleTon.getObject();
        System.out.println(obj2);

        SingleTon obj3 = SingleTon.getObject();
        System.out.println(obj3);
    }
}
