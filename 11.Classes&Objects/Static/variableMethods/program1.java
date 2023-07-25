package Static.variableMethods;

class demo1{
    int x=10;
    private int y =20;

    void disp(){
        System.out.println(x);
        System.out.println(y);
    }
}

class client{
    public static void main(String[] args) {
        // System.out.println(x);
        // System.out.println(y);

        // disp();
    }
}

/*
 Output:
    program1.java:15: error: cannot find symbol
        System.out.println(x);
                           ^
  symbol:   variable x
  location: class client
program1.java:16: error: cannot find symbol
        System.out.println(y);
                           ^
  symbol:   variable y
  location: class client
program1.java:18: error: cannot find symbol
        disp();
        ^
  symbol:   method disp()
  location: class client
3 errors
error: compilation failed
 */


