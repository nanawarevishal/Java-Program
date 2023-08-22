package RunTime;

class arithmaticException{

    void fun(){
        System.out.println("In fun");
        System.out.println(2/0);
    }

    void gun(){
        System.out.println("In Gun");
    }

    public static void main(String[] args) {
        arithmaticException obj = new arithmaticException();
        obj.fun();
        obj.gun();


    }
}


/*

Output:
        In fun
        Exception in thread "main" java.lang.ArithmeticException: / by zero       
                at RunTime.arithmaticException.fun(2_ArithmaticException.java:7)  
                at RunTime.arithmaticException.main(2_ArithmaticException.java:16)

 */
