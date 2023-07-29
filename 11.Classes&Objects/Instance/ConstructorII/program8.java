package Instance.ConstructorII;

class Demo8{
    private int jerNo = 0;
    private String name = null;

    void setter(int jerNo,String name){
        System.out.println(System.identityHashCode(name));
        this.jerNo = jerNo;
        this.name = name;
        System.out.println(System.identityHashCode(name));
    }

    void getter(){
        // System.out.println(System.identityHashCode(name));
        System.out.println(name+" : "+jerNo);
    }
}


class client8{
    public static void main(String[] args) {
        Demo8 obj1 = new Demo8();
        obj1.getter();
        obj1.setter(18, "Virat");
        obj1.getter();

        // Demo8 obj2 = new Demo8();
        // obj2.setter(07, "MSD");
        // obj2.getter();

        // Demo8 obj3 = new Demo8(45, "Rohit");
        // obj3.getter();

    }
}
