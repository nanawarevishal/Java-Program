package TryCatchFinally.TryCatchBlock;


class ArithmaticExcept{

    public static void main(String[] args) {

        System.out.println("In Main");

        try {
            
            System.out.println(10/0);

        } catch (ArithmeticException e) {
           e.printStackTrace();
           System.out.println("Exception Occured");
        }

        
        System.out.println("End Main");

    }
}


/*

Explanation:
            Catch is the special method which has it's entry in exception table and exception table is present in Method Area

 */
