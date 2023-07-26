package Instance.Constructor;

class demo{
    int x =10;
    void fun(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        demo obj = new demo();
        obj.fun();
    }
}
