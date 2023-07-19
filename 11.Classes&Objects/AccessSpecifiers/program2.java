package AccessSpecifiers;

class Demo{
    int x = 10;
    private int y =20;

    void fun(){
        System.out.println(x);
        System.out.println(y);
    }
}

class mainDemo{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.fun();

        // System.out.println(obj.x);
        // System.out.println(obj.y);

        // System.out.println(x);
        // System.out.println(y);
    }
}


/*

Output: 

        program2.java:19: error: y has private access in Demo
                System.out.println(obj.y);
                                    ^
        program2.java:21: error: cannot find symbol
                System.out.println(x);
                                ^
        symbol:   variable x
        location: class mainDemo
        program2.java:22: error: cannot find symbol
                System.out.println(y);
                                ^
        symbol:   variable y
        location: class mainDemo
        3 errors
        error: compilation failed


 */