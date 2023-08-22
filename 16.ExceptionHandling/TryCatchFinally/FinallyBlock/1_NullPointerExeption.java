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

        // try {
            
        //     obj.gun();
        // } catch (NullPointerException e) {
            
        //     System.out.println("Null Pointer Exception Occured...!");
        // }
        finally{
            System.out.println("Connection Closed....!");
        }

        System.out.println("End Main....!");
    }
}

/*
 Output:
        .\1_NullPointerExeption.java:27: error: 'finally' without 'try'
        finally{
        ^       
1 error
 */
