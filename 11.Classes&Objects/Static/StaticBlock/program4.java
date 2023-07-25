package Static.StaticBlock;

class demo4{
    static{
        // static int x =10;
        System.out.println(x);
    }

    public static void main(String[] args) {
        
    }
}

/*

Output:

        program4.java:5: error: illegal start of expression
                static int x =10;
                ^
        program4.java:6: error: <identifier> expected
                System.out.println(x);
                                ^
        program4.java:6: error: <identifier> expected
                System.out.println(x);
                                    ^
        program4.java:9: error: class, interface, enum, or record expected
            public static void main(String[] args) {
                        ^
        4 errors
        error: compilation failed

 */
