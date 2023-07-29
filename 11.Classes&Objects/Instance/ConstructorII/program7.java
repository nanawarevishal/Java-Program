package Instance.ConstructorII;

class Demo7{
    private int x =10;
    private int y = 20;

    Demo7(){

    }

    Demo7(int x,int y){
        this.x = x;
        this.y = y;
    }

    void setter(int x,int y){
        this.x = x;
        this.y = y;
    }

    void getter(){
        System.out.println(x);
        System.out.println(y);
    }
}

class client7{
    public static void main(String[] args) {
        Demo7 obj1 = new Demo7();
        // Demo7 obj = new Demo7(45, 34);

        obj1.setter(12, 20);
        obj1.getter();

        
    }
}