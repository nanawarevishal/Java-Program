package Instance.Constructor;

class demo3{
    int x =10;
    String str1 = "Shashi";

    void fun(){
        String str2 = "Shashi";
        // System.out.println(System.identityHashCode(str2));
        String str3 = new String("Core2Web");
    }

    public static void main(String[] args) {
        demo3 obj = new demo3();
        // System.out.println(System.identityHashCode(obj.str1));

        obj.fun();
    }
}
