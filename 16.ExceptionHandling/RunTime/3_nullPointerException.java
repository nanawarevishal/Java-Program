package RunTime;

class NUllPointerEx{

    void fun(){
        System.out.println("In fun");
    }

    void gun(){
        System.out.println("In gun");
    }

    public static void main(String[] args) {
        NUllPointerEx obj = new NUllPointerEx();
        obj.fun();
        obj = null;
        obj.gun();
    }
}


/*

 Output:
        In fun
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "RunTime.NUllPointerEx.gun()"           because "obj" is null
                    at RunTime.NUllPointerEx.main(3_nullPointerException.java:17)
                    
 */