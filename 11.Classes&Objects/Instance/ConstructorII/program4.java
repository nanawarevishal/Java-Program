package Instance.ConstructorII;

class Demo4{
    int x =10;
    Demo4(){
        this(20);
        System.out.println(x);
        System.out.println("In No-Args Constructor...");
    }

    Demo4(int x){
        System.out.println(x);
        System.out.println("In Para Costructor...");
    }

    public static void main(String[] args) {
        Demo4 obj1 = new Demo4();
        Demo4 obj2 = new Demo4(20);
    }
}
