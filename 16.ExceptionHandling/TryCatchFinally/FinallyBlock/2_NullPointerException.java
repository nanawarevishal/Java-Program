package TryCatchFinally.FinallyBlock;

class NullPointerExcept{

    void fun(){

    }
    void gun(){

    }

    public static void main(String[] args) {

        System.out.println("Start Main");
        NullPointerExcept obj = new NullPointerExcept();
        obj.fun();
        obj = null;
        obj = null;

        try {
            
            obj.gun();
        } catch (ArithmeticException e) {
            
            System.out.println("Null Pointer Exception Occured...!");
        }
        finally{
            
            System.out.println("Connection Closed....!");
        }

        System.out.println("End Main....!");
    }
}

/*
 Output:
        Start Main
        Connection Closed....!
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "TryCatchFinally.FinallyBlock.NullPointerExcept.gun()" because "<local1>" is null
                at TryCatchFinally.FinallyBlock.NullPointerExcept.main(2_NullPointerException.java:22)
 */