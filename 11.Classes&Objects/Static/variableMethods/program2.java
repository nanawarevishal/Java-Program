package Static.variableMethods;


class demo1{
    int x=10;
    private int y =20;

    void disp(){
        System.out.println(x);
        System.out.println(y);
    }
     public static void main(String[] args) {
        // System.out.println(x);
        // System.out.println(y);

        // disp();
    }
}

class client{
    public static void main(String[] args) {

    }
}

/*
 Output:
    program2.java:13: error: non-static variable x cannot be referenced from a static context
        System.out.println(x);
                           ^
    program2.java:14: error: non-static variable y cannot be referenced from a static context
            System.out.println(y);
                            ^
    program2.java:16: error: non-static method disp() cannot be referenced from a static context
            disp();
        ^
3 errors
error: compilation failed
 */